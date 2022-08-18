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
     * Der Konstruktor nimmt den Namen und die Matrikelnummer entgegen
     * @param name Der Name des Studenten
     * @param matrikel Die Matrikelnummer des Studenten
     */
    public Student(String name, String matrikel)
    {
        super(name); 
        this.matrikel = matrikel; 
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
        String rueckgabe = super.vorstellen();
        rueckgabe += "Meine Matrikelnummer ist " + matrikel + ". ";
        return rueckgabe; 
    }	

    @Override
    public boolean equals(Object another)
    {
        //if(this == another) 
        //    return true;  

        //if(super.equals(another))
        //{
        //    Student temp = (Student) another; 
        //    if(this.getMatrikel() == temp.getMatrikel())
        //        return true; 
        //}

        //return false; 
        
        if( matrikel.equals(((Student)another).getMatrikel()) )
        {return true;}
        return false;
        
    }

    @Override
    public int hashCode()
    {
        return matrikel.hashCode() + getName().hashCode();
    }
}
