
/**
 * Beschreiben Sie hier die Klasse Ampelfarbe_2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ampelfarbe_2
{
    public static final Ampelfarbe_2 ROT = new Ampelfarbe_2("Anhalten"); 
    public static final Ampelfarbe_2 GELB = new Ampelfarbe_2("Gang einlegen");
    public static final Ampelfarbe_2 GRÜN = new Ampelfarbe_2("Fahren");
    private String hinweis;
    
    private Ampelfarbe_2(String hinweis)
    {
            this.hinweis = hinweis;
    }
    
    public String getHinweis()
    {
        return hinweis;
    }
}
