
/**
 * Die Klasse Kunde repr‰sentiert einen Kunden der Bank
 * 
 * @author      Florian
 * @version     Kapitel 8 - Version 2
 */
public class Kunde
{
    private boolean weiblich = false;  
    private String name = new String(); 
    private Konto girokonto = new Konto(); 
    private Mensch mensch = new Mensch();
    /**
     * Setzt den Namen des Kunden
     * @param name Der Name des Kunden
     */
//    public void setName(String pName)
    public void setName(String name)
    {
//		name = pName;	
        this.name = name;
    }
    
    /**
     * Der Kunde stellt sich vor - auf der Konsole wird ein entsprechender Text ausgegeben
     */
    public void vorstellen()
    {
        System.out.println("Guten Tag, ich heiﬂe " + name + "." + "und bin ein " + mensch.species);
    }
}
