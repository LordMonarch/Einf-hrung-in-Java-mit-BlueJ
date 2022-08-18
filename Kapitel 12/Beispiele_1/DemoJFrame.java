
/**
 * Zeigt die Verwendung der Klasse JFrame
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import java.awt.Component;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;
import javax.swing.WindowConstants;

public class DemoJFrame
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
        
        // Root Pane abfragen
        JRootPane rtpMain = frmMain.getRootPane();
        // Layered Pane abfragen
        JLayeredPane lypMain = frmMain.getLayeredPane();
        // Content Pane abfragen
        Container ctpMain = frmMain.getContentPane();
        // Glass Pane abfragen
        Component glpMain = frmMain.getGlassPane();
        
        frmMain.getContentPane().setBackground(Color.RED);
        
        // Einen neuen Button hinzufügen 
        // frmMain.getContentPane().add(new JButton("Button 1"));
        
        // alternative Codierung: 
        // frmMain.add(new JButton("Button 2"));
    }
}