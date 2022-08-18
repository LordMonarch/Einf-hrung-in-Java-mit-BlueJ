
/**
 * Der Gaukler zaubert und f�hrt Kunstst�cke vor. Er informiert dar�ber die Zuschauer
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
public class GauklerImpl implements GauklerModel
{ 
    // ein Zuschauer
    private Zuschauer zuschauer = null; 
    
    // Information �ber die letzte Aktion
    private String letzteAktivitaet = new String("Ich habe noch nichts getan!");
    
    /**
     * gibt zur�ck, was der Gaukler zuletzt getan hat
     */
    public String getAktion()
    {
        return letzteAktivitaet;
    }
    
    /**
     * zeigt eine Status�nderung an. 
     */
    public void jongliere()
    {
        letzteAktivitaet = "Drei B�lle - vier B�lle - f�nf B�lle"; 
        notifyZuschauer();
    } 
    
    /**
     * informiert den Zuschauer �ber eine Aktion
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
