
/**
 * Die Klasse Mensch modelliert gemeinsame Datenfelder und Methoden eines Menschen
 * 
 * @author      Florian 
 * @version     Kapitel 9
 */
public class Mensch
{
    /**
     * Der Name des Menschen
     */
    private String name = new String();
    
    /**
     * Der Konstruktor nimmt den Namen des Menschen entgegen und 
     * initialisiert das Feld name damit
     * @param name Name des Menschen
     */
    protected Mensch(String name)
    {
        this.name = name; 
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
        return "Guten Tag, ich heiße " + name + ".";
    }
}
