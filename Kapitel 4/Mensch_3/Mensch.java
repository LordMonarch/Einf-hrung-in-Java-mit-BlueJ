
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
    private static final String SPEZIES = "homo sapiens";  
    /**
     * statischer Zähler für die Anzahl der Instanzen
     */
    private static int zaehler = 0;
    /**
     * gibt an, wie viele Kinder der Mensch hat
     */
    private int kinder = 0;    

    /**
     * lässt den Menschen um ein Jahr altern
     */
    public void altern()
    {
        alter = alter + 1;
    }

    /**
     * Erhöht den Wert des Zählers um 1
     */
    public void hochzaehlen()
    { 
        zaehler = zaehler + 1;
    }
    
    /**
     * Erhöht die Anzahl der Kinder um den eingegebenen Wert
     */
    public void erhoeheKinderzahl(int anzahl)
    {
        kinder = kinder + anzahl;
    } 
}
