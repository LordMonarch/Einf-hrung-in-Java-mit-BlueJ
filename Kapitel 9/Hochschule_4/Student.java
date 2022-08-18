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
     * Der Konstruktor nimmt den Namen entgegen und reicht ihn an die Superklasse weiter
     * @param name Der Name des Studenten
     */
    public Student(String name)
    {
        super(name); 
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

    /**
     * Der student stellt sich vor.
     * @return Eine Zeichenkette, die die Datenfelder des Studenten formatiert zurückgibt. 
     */    
    public String vorstellen()
    {
        String rueckgabe = "Guten Tag, ich heiße " + getName() + ". " + 
            "Meine Matrikelnummer ist " + getMatrikel();
        return rueckgabe; 
    }
}
