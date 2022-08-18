
/**
 * Beschreiben Sie hier die Klasse Angestellter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Angestellter extends Mitarbeiter
{
    private boolean personalrat;
    
    public void setPersonalrat(boolean personalrat)
    {
        this.personalrat = personalrat;
    }
    
    public boolean getPersonalrat()
    {
        return personalrat;
    }
}
