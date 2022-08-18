
/**
 * Beschreiben Sie hier die Klasse Marktbesucher.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.Observer;
import java.util.Observable;
public class Marktbesucher implements Observer
{
    private String name;
    public Marktbesucher(String name)
    {
        this.name = name;
    }
    
    public void update(Observable ausloeser, Object aktion)
    {
        int zufallszahl = (int)(Math.random() * 10);
        if(zufallszahl < 5)
            System.out.println(name + " sagt: \"Ahhh!\"");
        else
            System.out.println(name + " sagt: \"Ohhh!\"");
    }
    
    @Override
    public String toString()
    {
        return name;
    } 
}
