
/**
 * Beschreiben Sie hier die Klasse DemoJWindow.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.WindowConstants;

public class DemoJWindow
{
    public static void main(String[] args)
    {       
        // Instanz der Klasse JFrame
        JFrame frmMain = new JFrame();
        
        // Gr��e in Pixel
        frmMain.setSize(400, 400);
        
        // Titel setzen
        frmMain.setTitle("Mein JFrame");
        
        // sichtbar machen und anzeigen
        frmMain.setVisible(true); 
        
        // Programm beenden, wenn Fenster geschlossen wird
        frmMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                 
        // Instanzen der Klasse JWindow erzeugen
        JWindow wndUnabhaengig = new JWindow();        
        JWindow wndAbhaengig = new JWindow(frmMain);
        
        // Die Position auf dem Bildschirm festlegen
        wndUnabhaengig.setLocation(100, 100);        
        wndAbhaengig.setLocation(200, 200);
        
        // unterschiedliche Hintergrundfarben
        wndUnabhaengig.getContentPane().setBackground(Color.YELLOW);
        wndAbhaengig.getContentPane().setBackground(Color.GREEN); 
        
        // Anzeigefelder f�r Text
        wndUnabhaengig.add(new JLabel("Ich bin unabh�ngig von meinem Erzeuger"));
        wndAbhaengig.add(new JLabel("Ich bin abh�ngig von meinem Erzeuger"));
        
        // automatisch die optimale Gr��e der Fenster bestimmen lassen
        wndUnabhaengig.pack();
        wndAbhaengig.pack();
        
        // Fenster anzeigen
        wndUnabhaengig.setVisible(true);
        wndAbhaengig.setVisible(true);        
    }
}
