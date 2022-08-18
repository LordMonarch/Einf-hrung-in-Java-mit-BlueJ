
/**
 * Beschreiben Sie hier die Klasse Gaukler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gaukler
{
    private String letzteAktivität = new String();
    Zuschauer zuschauer = null;
    public void jongliere()
    {
        letzteAktivität = "Ich habe jongliert";
        notifyZuschauer();
    }
    
    public String getAktion()
    {
        return letzteAktivität;
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
