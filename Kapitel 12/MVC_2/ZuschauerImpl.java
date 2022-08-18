
/**
 * Beschreiben Sie hier die Klasse ZuschauerImpl.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ZuschauerImpl implements Zuschauer
{
    private Gaukler gaukler;
    @Override
   public void update()
   {
       String aktion = gaukler.getAktion();
       System.out.println("Der Gaukler sagt: " + aktion);
       System.out.println("Ahhh! Ohhh!");
    }
   
    @Override
    public void setGaukler(Gaukler gaukler)
    {
        this.gaukler = gaukler;
        gaukler.addZuschauer(this);
    }
    
}
