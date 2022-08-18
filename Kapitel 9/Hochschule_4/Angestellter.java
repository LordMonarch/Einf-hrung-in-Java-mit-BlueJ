/**
 * Die Klasse Angestellter modelliert einen Mitarbeiter, der kein Professor ist. 
 * 
 * @author      Florian
 * @version     Kapitel 9
 */
public class Angestellter extends Mitarbeiter
{
    /**
     * Speichert, ob der Angestellte Mitglied des Personalrates ist
     */
    private boolean personalrat; 

    /**
     * Konstruktor nimmt den Namen des Angestellten entgegen und reicht ihn an die Superklasse weiter
     * @param name Der Name des Angestellten 
     */
    public Angestellter(String name)
    {
        super(name);
    }
    
    /**
     * Konstruktor nimmt den Namen und die Personalnummer des Angestellten entgegen und reicht 
     * beide an die Superklasse weiter
     * @param name Der Name des Angestellten
     * @param personalnummer Die Personalnummer des Angestellten
     */
    public Angestellter(String name, int personalnummer)
    {
        super(name, personalnummer);
    }
    
    /**
     * Legt fest, ob der Angestellte dem Personalrat angehört
     * @param personalrat Wahrheitswert, der die Zugehörigkeit bestimmt
     */
    public void setPersonalrat(boolean personalrat)
    {
        this.personalrat = personalrat;
    }

    /**
     * Gibt zurück, ob der Angestellte Mitglied im Personalrat ist
     * @return true, wenn Personalrat, sonst false
     */
    public boolean isPersonalrat()
    {
        return personalrat; 
    }

    /**
     * Gibt einen String zurück, der einen Vorstellungstext enthält
     * @return Zeichenkette mit einer kurzen Vorstellung
     */
    public String vorstellen()
    {
        String rueckgabe = "Guten Tag, ich heiße " + getName() + ". "; 
        rueckgabe += "Meine Personalnummer ist " + getPersonalnummer();
        if(isPersonalrat())
            rueckgabe += " und ich bin Personalratsmitglied. ";
        else 
            rueckgabe += " und ich bin kein Personalratsmitglied.";
        return rueckgabe; 
    }
}
