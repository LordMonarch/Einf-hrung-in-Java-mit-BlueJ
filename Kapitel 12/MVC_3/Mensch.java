 

/**
 * Die Klasse Mensch definiert Attribute und Methoden eines Menschen, der an der Hochschule aktiv ist
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
public abstract class Mensch implements GauklerModel
{
    /**
     * Der Vorname des Betroffenen
     */
    private String vorname = new String();
    
    /** 
     * Der aktuelle Familienname des Betroffenen
     */
    private String familienname = new String();
    
    /**
     * Der Geburtsname des Betroffenen
     */
    private String geburtsname = new String();
    
    /**
     * Der Partner des Betroffenen
     */
    private Mensch partner;
    
    /**
     * Zuschauer, wenn der Mensch auch Gaukler sein soll
     */
    protected Zuschauer zuschauer = null;
    
    // Information über die letzte Aktion
    protected String letzteAktivitaet = new String("Ich habe noch nichts getan!");
    
    // Methoden des Interfaces GauklerModel    
    /**
     * gibt zurück, was der Gaukler zuletzt getan hat
     */
    public String getAktion()
    {
        return letzteAktivitaet;
    }
    
    /**
     * informiert den Zuschauer über eine Aktion
     */
    public void notifyZuschauer()
    {
        zuschauer.update();
    }
    
    /**
     * registriert einen Zuschauer 
     * @param Zuschauer ein Zuschauer
     */
    public void addZuschauer(Zuschauer zuschauer)
    {
        this.zuschauer = zuschauer;
    }
    
    /**
     * Konstruktor, der den Vor- und Familiennamen als Parameter erwartet
     * @param String vorname: der Vorname des Betroffenen
     * @param String familienname: der Familienname des Betroffenen
     */
    protected Mensch(String vorname, String familienname)
    {
        this.vorname = vorname; 
        this.familienname = familienname;
    }
    
    /**
     * ermöglicht es, zu heiraten
     */
    public void heiraten(Mensch partner)
    {
        if(this.partner == null && partner.partner == null)
        {
            if(this == partner)
            {
                System.out.println(vorname + " versucht, sich selbst zu heiraten!");
            }
            else
            {
                this.partner = partner;
                partner.partner = this;
                System.out.println(vorname + " " + familienname + " heiratet " + partner.vorname + " " + partner.familienname);
            }
        }
        else
        {
            System.out.println(this.vorname + " und " + partner.vorname + " können nicht heiraten, weil mindestens einer von beiden bereits verheiratet ist.");
        }
    }
    
    public void scheiden()
    {
        if(partner != null)
        {
            partner.partner = null; 
            partner = null;
            System.out.println(vorname + " ist jetzt geschieden.");
        }
        else
        {
            System.out.println(vorname + " ist nicht verheiratet und kann sich daher auch nicht scheiden lassen. ");
        }
    }
    
    /**
     * Mit dieser Methode stellt sich ein Akteur mit Vor- und Familiennamen vor.
     */
    public void vorstellen()
    {
        System.out.print("Guten Tag, ich heiße " + vorname + " " + familienname + ". ");
    }
    
    /**
     * Setzt den Vornamen  
     * @param String der Vorname
     */
    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }
        
    /**
     * Setzt den aktuellen Familienname 
     * @param String Der aktuelle Familienname
     */
    public void setFamilienname(String familienname)
    {
        this.familienname = familienname;
    }     
    
    /**
     * Setzt den Geburtsnamen
     * @param String Der Geburtsname
     */
    public void setGeburtsname(String geburtsname)
    {
        this.geburtsname = geburtsname;
    }
    
    /**
     * Gibt den Vornamen zurück
     * @return Der Vorname des Beteiligten
     */
    public String getVorname()
    {
        return vorname;
    }
        
    /**
     * Gibt den Familiennamen zurück
     * @return Der Familienname des Beteiligten
     */
    public String getFamilienname()
    {
        return familienname;
    }     
    
    /**
     * Gibt den Geburtsnamen zurück
     * @return Der Geburtsname des Betroffenen
     */
    public String getGeburtsname()
    {
        return geburtsname;
    }
    
    /**
     * vergleicht zwei Objekte, überschreibt die equals-methode der Klasse Object
     * @param: Object obj - das zu vergleichende Objekt
     * @return: boolean true wenn gleich
     */
    public boolean equals(Object obj) 
    {    
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
            
        Mensch temp = (Mensch) obj; 
        if((this.vorname + this.geburtsname).equals(temp.vorname + temp.geburtsname))
            return true;            
        return false;
    }

    /**
     * gibt die String-Repräsentation des Objektes zurück - überschreibt die Methode toString() der Klasse Object
     * @return: String - die String-Repräsentation
     */
    public String toString()
    {
        String result = new String();
        result = vorname + " " + familienname;
        if(partner != null)
        {
            result += " - verheiratet mit " + partner.vorname + " " + partner.familienname;
        }
        else
        {
            result += " - nicht verheiratet";
        }
        
        return result;
    }
    
    /**
     * Gibt den Hashcode des Objektes zurück - überschreibt die hashCode()-Methode der Klasse Object
     * @return: int den HashCode
     */
    public int hashCode()
    {
        return vorname.hashCode() + geburtsname.hashCode();
    }
}
