
/**
 * Beschreiben Sie hier die Klasse Gaukler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gaukler
{
    Zuschauer zuschauer = null;
    public void jongliere()
    {
        System.out.println("Ich jongliere mit fünf Bällen");
        notifyZuschauer();
    }
    public void notifyZuschauer()
    {
        zuschauer.update();
    }
    public void addZuschauer(Zuschauer zuschauer)
    {
        this.zuschauer = zuschauer;
    }
}
