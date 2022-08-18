
/**
 * Beschreiben Sie hier die Klasse Einwohnermeldeamt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 * 
 * Singleton-Pattern
 */
public class Einwohnermeldeamt
{
    private static Einwohnermeldeamt instance = new Einwohnermeldeamt();
    private Einwohnermeldeamt() {}
    public static Einwohnermeldeamt getInstance()
    {
        return instance;
    }
}
