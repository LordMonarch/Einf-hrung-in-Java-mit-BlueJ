
/**
 * Demonstriert die Verwendung von Dialog-Fenstern
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class DemoJDialog
{ 
    public static void main(String[] args)
    {
        // Instanz der Klasse JFrame
        JFrame frmMain = new JFrame();
        
        // Größe in Pixel
        frmMain.setSize(400, 400);
        
        // Titel setzen
        frmMain.setTitle("Mein JFrame");
        
        // sichtbar machen und anzeigen
        frmMain.setVisible(true);
        
        // Programm beenden, wenn Fenster geschlossen wird
        frmMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // Instanzen der Klasse JDialog erzeugen
        JDialog dlgDemoNichtModal = new JDialog(frmMain, "Nicht-modales Dialogfenster", false);
        JDialog dlgDemoModal = new JDialog(frmMain, "Modales Dialogfenster", true);
        
        // Größe der Dialoge festlegen
        dlgDemoModal.setSize(200, 200);
        dlgDemoNichtModal.setSize(200, 200);
        
        // Dialoge anzeigen
        dlgDemoModal.setVisible(true);
        dlgDemoNichtModal.setVisible(true); 
    }
}


