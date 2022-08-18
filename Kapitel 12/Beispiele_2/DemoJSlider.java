/**
 * Demonstriert die Verwendung der Klasse JSlider
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DemoJSlider extends JFrame implements ChangeListener
{
    private JFrame frmMain;

    private JSlider sldWerte;
    
    public static void main(String[] args)
    {
        new DemoJSlider();
    }
    
    public DemoJSlider()
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JSlider");
        
        // Grundlage für die Komponenten
        JPanel pnlOberflaeche = new JPanel();
         
        // Instanz der Klasse JSlider - Wertebereich 0 bis 100
        sldWerte = new JSlider(0, 100, 0);
                
        // Instanz der Klasse JSlider - vertikale Ausrichtung
        // sldWerte = new JSlider(SwingConstants.VERTICAL);
        
        // Instanz der Klasse JSlider - horizontale Ausrichtung (Standard-Einstellung)
        // sldWerte = new JSlider(SwingConstants.HORIZONTAL);
        
        // Fünfer-Schritt anzeigen
        sldWerte.setMinorTickSpacing(5);
        
        // die Drittel besonders betonen
        sldWerte.setMajorTickSpacing(33);  
        
        sldWerte.setSnapToTicks(true);
        
        // die Ticks anzeigen
        sldWerte.setPaintLabels(true);
        sldWerte.setPaintTicks(true);
         
        // Listener registrieren
        sldWerte.addChangeListener(this);
        
        // JSlider auf das Panel legen
        pnlOberflaeche.add(sldWerte);
                 
        // Panel in das Fenster einfügen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Größe 
        frmMain.pack();
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    }
    
    @Override
    public void stateChanged(ChangeEvent ev)
    {
        int wert = sldWerte.getValue();
        String text = "Projektfortschritt: " + wert + " %"; 
        frmMain.setTitle(text);
    }
}