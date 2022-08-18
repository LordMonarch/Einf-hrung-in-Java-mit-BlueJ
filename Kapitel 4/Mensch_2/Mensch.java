
/**
 * Die Klasse Mensch repr�sentiert die f�r das Programm notwendigen Attribute eines Menschen
 * 
 * @author      Florian 
 * @version     Kapitel 4
 */
public class Mensch
{ 
    /**
     * enth�lt das Alter des Menschen
     */
    private int alter = 0;
    /**
     * enth�lt den Namen des Menschen 
     */
    private String name = "Max Muster";
    /**
     * enth�lt die biologische Beschreibung 
     */
    private static String spezies = "homo sapiens";  
    /**
     * statischer Z�hler f�r die Anzahl der Instanzen
     */
    private static int zaehler = 0;
    
    /**
     * Erh�ht den Wert des Z�hlers um 1
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
     * l�sst den Menschen um ein Jahr altern
     */
    public void altern()
    {
        alter = alter + 1;
    }
    
    /**
     * Erh�ht den Wert des Z�hlers um 2
     */
    public void addiereZwei()
    {
        int wert = 2;
        
        // in der Praxis stehen hier viele Zeilen Code
        
        zaehler = zaehler + wert;
    }
    
    
}
