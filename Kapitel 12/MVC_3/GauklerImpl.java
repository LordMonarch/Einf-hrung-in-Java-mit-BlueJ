
/**
 * Der Gaukler zaubert und führt Kunststücke vor. Er informiert darüber die Zuschauer
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
public class GauklerImpl implements GauklerModel
{ 
    // ein Zuschauer
    private Zuschauer zuschauer = null; 
    
    // Information über die letzte Aktion
    private String letzteAktivitaet = new String("Ich habe noch nichts getan!");
    
    /**
     * gibt zurück, was der Gaukler zuletzt getan hat
     */
    public String getAktion()
    {
        return letzteAktivitaet;
    }
    
    /**
     * zeigt eine Statusänderung an. 
     */
    public void jongliere()
    {
        letzteAktivitaet = "Drei Bälle - vier Bälle - fünf Bälle"; 
        notifyZuschauer();
    } 
    
    /**
     * informiert den Zuschauer über eine Aktion
     */
    public void notifyZuschauer()
    {
        zuschauer.update();
    }
    
    /**
     * registriert einen Zuschauer 
     * @param Zuschauer ein Zuschauer
     */
    public void addZuschauer(Zuschauer zuschauer)
    {
        this.zuschauer = zuschauer;
    }
}
