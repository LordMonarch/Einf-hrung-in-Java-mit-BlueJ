 

/**
 * Die Klasse Student definiert die Attribute und Methoden eines Studenten
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
public class Student extends Mensch 
{ 
    /**
     * Die Matrikelnummer des Studenten
     */
    private String matrikel = new String(); 
    // private String vorname = "test";
       
    
    /**
     * drei mögliche Aktionen
     */
    public void jongliere()
    {
        letzteAktivitaet = "Ich jongliere mit vier Bällen."; 
        notifyZuschauer();
    } 
    
    public void zersaegeJungfrau()
    {
        letzteAktivitaet = "Ich zersäge meine Assistentin."; 
        notifyZuschauer();
    }
    
    public void zaubereKaninchen()
    {
        letzteAktivitaet = "Ich hole ein Kaninchen aus dem Zylinder."; 
        notifyZuschauer();
    }
    
    /**
     * Konstruktor der Student-Klasse - übergibt Vor- und Familienname an die Superklasse
     */
    public Student(String vorname, String familienname)
    {
        super(vorname, familienname);
    }
        
    /**
     * Mit dieser Methode kann ein Student sich vorstellen
     */
    public void vorstellen()
    { 
		super.vorstellen();
        System.out.println("Ich bin Student");
    }
    
    /**
     * Setzt die Immatrikulationsnummer 
     * @param String Die Matrikelnummer
     */
    public void setMatrikel(String matrikel)
    {
        this.matrikel = matrikel;
    } 
    
    /**
     * Gibt die Immatrikulationsnummer zurück
     * @return Matrikelnummer des Studenten
     */
    public String getMatrikel()
    {
        return matrikel;
    }
}
