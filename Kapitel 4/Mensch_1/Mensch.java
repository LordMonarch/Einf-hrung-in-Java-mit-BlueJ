
/**
 * Die Klasse Mensch repräsentiert die für das Programm notwendigen Attribute eines Menschen: 
 * Alter und Name
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
    private final String SPEZIES = "homo sapiens";  
    
    /**
     * lässt den Menschen um ein Jahr altern
     */
    public void altern()
    {
        alter = alter + 1;
    }
}
