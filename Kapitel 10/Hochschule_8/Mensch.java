
/**
 * Die Klasse Mensch modelliert gemeinsame Datenfelder und Methoden eines Menschen
 * 
 * @author      Florian 
 * @version     Kapitel 9
 */
public abstract class Mensch
{
    /**
     * Der Name des Menschen
     */
    private String name = new String();
    /**
     * Der Partner des Menschen
     */
    private Mensch partner = null; 
    /**
     * Preis für eine Essensmarke
     */
    protected final int PREIS = 5;

    /**
     * Der Konstruktor nimmt den Namen des Menschen entgegen und 
     * initialisiert das Feld name damit
     * @param name Name des Menschen
     */
    protected Mensch(String name)
    {
        this.name = name; 
    }

    public abstract int kaufeMarken(int anzahl);
    
    /**
     * Verheiratet einen Menschen
     * @param partner Referenz auf das Partner-Objekt
     */
    protected void heiraten(Mensch partner)
    {        
        if(this != partner)
        {
            if(this.partner == null && partner.partner == null)
            {
                this.partner = partner;
                partner.partner = this; 
                System.out.println(name + " und " + partner.getName() + " haben geheiratet. ");
            }
            else
            {
                System.out.println(name + " und " + partner.getName() + " können nicht heiraten, weil mindestens einer der beiden bereits verheiratet ist.");
            }
        }
        else
        {
            System.out.println(name + " kann sich nicht selbst heiraten.");
        }
    }

    /**
     * Löst die Heirat des Menschen auf
     */
    protected void scheiden()
    {
        if(partner != null)
        {
            String tempName = partner.getName();
            partner.partner = null; 
            this.partner = null;
            System.out.println(this.name + " und " + tempName + " sind jetzt geschieden");
        }
        else
        {
            System.out.println(name + " kann sich nicht scheiden lassen, weil er / sie nicht verheiratet ist.");
        }
    }

    /**
     * Setzt den Namen des Menschen
     * @param String Der Name des Menschen
     */
    public void setName(String name)
    {
        this.name = name; 
    }

    /**
     * Gibt den Namen des Menschen zurück
     * @return Der Name des Menschen
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gibt einen kurzen Vorstellungstext des Menschen aus
     * @return Ein kurzer Vorstellungstext
     */
    public String vorstellen()
    {
        return "Guten Tag, ich heiße " + name + ". ";
    }

    @Override
    public String toString()
    {
        return name + " - " + getClass();
    }

    @Override
    public boolean equals(Object another)
    {
        if(this == another)
        {
            return true; 
        }

        if(another == null)
        {
            return false;
        }

        if(another instanceof Mensch)
        {
            Mensch tempObj = (Mensch) another;
            if(this.name.equals(tempObj.getName()))
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        else 
        {
            return false;
        }
    }
}
