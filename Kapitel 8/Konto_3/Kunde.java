
/**
 * Die Klasse Kunde modelliert einen Kunden der Bank
 * 
 * @author      Florian
 * @version     Kapitel 8 - Version 3
 */
public class Kunde
{
    private boolean weiblich = false;  
    private String name = new String(); 
    private Konto girokonto = new Konto(); 
    
    public Kunde(String name, boolean weiblich)
    {
        this.name = name; 
        this.weiblich = weiblich;
    }
    
    public Kunde(boolean weiblich, String name)
	{
		this.name = name; 
		this.weiblich = weiblich;
	} 
    
	/**
     * Setzt den Namen des Kunden
     * @param name Der Name des Kunden
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Der Kunde stellt sich vor - auf der Konsole wird ein entsprechender Text ausgegeben
     */
    public void vorstellen()
    {
        System.out.println("Guten Tag, ich heiﬂe " + name + ".");
    }
}
