
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
    private static final String SPEZIES = "homo sapiens";  
    /**
     * statischer Z�hler f�r die Anzahl der Instanzen
     */
    private static int zaehler = 0;
    /**
     * gibt an, wie viele Kinder der Mensch hat
     */
    private int kinder = 0;    

    /**
     * l�sst den Menschen um ein Jahr altern
     */
    public void altern()
    {
        alter = alter + 1;
    }

    /**
     * Erh�ht den Wert des Z�hlers um 1
     */
    public void hochzaehlen()
    { 
        zaehler = zaehler + 1;
    }
    
    /**
     * Erh�ht die Anzahl der Kinder um den eingegebenen Wert
     */
    public void erhoeheKinderzahl(int anzahl)
    {
        kinder = kinder + anzahl;
    } 
}
