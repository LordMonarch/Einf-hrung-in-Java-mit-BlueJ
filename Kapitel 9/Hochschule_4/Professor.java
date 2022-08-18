
/**
 * Die Klasse Professor definiert Attribute und Methode eines Professors der Hochschule 
 * 
 * @author      Florian 
 * @version     Kapitel 9
 */
public class Professor extends Mitarbeiter
{ 
    /**
     * Der Fachbereich des Professors 
     */
    private String fachbereich = new String(); 

    /**
     * Konstruktor, der den Namen des Professor als Parameter erwartet
     * @param name Der Name des Professors
     */
    public Professor(String name)
    {
        super(name);
    }
    
    /**
     * Setzt den Fachbereich 
     * @param String Der Fachbereich 
     */
    public void setFachbereich(String fachbereich)
    {
        this.fachbereich = fachbereich;
    }

    /**
     * Gibt den Fachbereich des Professors zurück
     * @return Fachbereich des Professors
     */
    public String getFachbereich()
    {
        return fachbereich;
    }

    /**
     * Der Professor stellt sich vor 
     * @return Zeichenkette mit dem Vorstellungstext
     */
    public String vorstellen()
    {
        String rueckgabe = "Guten Tag, ich heiße " + getName() + ". " + 
            "Ich lehre " + fachbereich + " und meine Personalnummer ist " + getPersonalnummer();
        return rueckgabe; 
    }
}
