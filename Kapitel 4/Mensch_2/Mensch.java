
/**
 * Die Klasse Mensch repräsentiert die für das Programm notwendigen Attribute eines Menschen
 * 
 * @author      Florian 
 * @version     Kapitel 4
 */
public class Mensch
{ 
    /**
     * enthält das Alter des Menschen
     */
    private int alter = 0;
    /**
     * enthält den Namen des Menschen 
     */
    private String name = "Max Muster";
    /**
     * enthält die biologische Beschreibung 
     */
    private static String spezies = "homo sapiens";  
    /**
     * statischer Zähler für die Anzahl der Instanzen
     */
    private static int zaehler = 0;
    
    /**
     * Erhöht den Wert des Zählers um 1
     */
    public void hochzaehlen()
    {
        zaehler = zaehler + 1;
    }

    public static void aendereSpecies()
    {
        spezies = "homo oeconomicus";
    }
    
    /**
     * lässt den Menschen um ein Jahr altern
     */
    public void altern()
    {
        alter = alter + 1;
    }
    
    /**
     * Erhöht den Wert des Zählers um 2
     */
    public void addiereZwei()
    {
        int wert = 2;
        
        // in der Praxis stehen hier viele Zeilen Code
        
        zaehler = zaehler + wert;
    }
    
    
}
