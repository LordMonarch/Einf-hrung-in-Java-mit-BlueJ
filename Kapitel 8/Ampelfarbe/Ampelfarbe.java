
/**
 * Beschreiben Sie hier die Aufzählungsklasse Ampelfarbe.
 * 
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public enum Ampelfarbe
{
    ROT("Anhalten"), GELB("Gang einlegen"), GRÜN("Fahren");
    private String hinweis;
    
    private Ampelfarbe(String hinweis);
    {
        this.hinweis = hinweis;
    }
    
    public String getHinweis()
    {
        return hinweis;
    }
}
