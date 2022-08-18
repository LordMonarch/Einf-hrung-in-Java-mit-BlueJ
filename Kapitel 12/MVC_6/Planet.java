
/**
 * Stellt den Datentyp Planet zur Verf�gung: bis jetzt wird nur der Name des Planeten gespeichert
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
public class Planet
{
    // Name des Planeten ... in der Praxis w�rde es wohl weitere Datenfelder geben
    private String name; 
        
    // Konstruktor
    public Planet(String name)
    {
        this.name = name; 
    }
       
    @Override
    public String toString()
    {
        return name;
    }
}