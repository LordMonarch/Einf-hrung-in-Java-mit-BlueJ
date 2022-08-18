
/**
 * Die Klasse Mensch repr�sentiert die f�r das Programm notwendigen Attribute eines Menschen: 
 * Alter und Name
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
    private final String SPEZIES = "homo sapiens";  
    
    /**
     * l�sst den Menschen um ein Jahr altern
     */
    public void altern()
    {
        alter = alter + 1;
    }
}
