/**
 * Die Klasse Student definiert die Attribute und Methoden eines Studenten
 * 
 * @author      Florian 
 * @version     Kapitel 9
 */
public class Student extends Mensch
{ 

    /**
     * Die Matrikelnummer des Studenten
     */
    private String matrikel = new String(); 

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
