
/**
 * Der Zuschauer beobachtet den Gaukler und zeigt Bewunderung
 * 
 * @author      Florian 
 * @version     Kapitel 10 
 */
import javax.swing.*;
public class ZuschauerImpl extends JFrame implements Zuschauer
{  
    // Referenz auf den Gaukler
    private GauklerModel gaukler; 
    
    public ZuschauerImpl()
    {
        this.setTitle("neues Fenster");
        this.setSize(500, 300);
        this.setVisible(true);
    }
    
    public void setGaukler(GauklerModel gaukler)
    {
        this.gaukler = gaukler; 
        gaukler.addZuschauer(this);
    }

    /**
     * wird vom Gaukler aufgerufen, wenn dieser ein Kunststück vorgeführt hat. 
     */
    public void update()
    {
        String aktion = gaukler.getAktion();
        this.setTitle(aktion);
    }
}
