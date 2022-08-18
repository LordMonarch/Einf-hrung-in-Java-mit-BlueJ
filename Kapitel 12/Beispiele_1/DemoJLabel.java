/**
 * Demonstriert die Verwendung der Klasse DemoJLabel
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.*; 
import java.awt.*;

public class DemoJLabel extends JFrame
{
    public static void main(String[] args)
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        JFrame frmMain = new DemoJLabel();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JLabel");
        
        // Instanzen der Klasse erzeugen: 
        // ein Label ohne Text
        JLabel lblLeer = new JLabel();
        // ein Label mit Text
        JLabel lblText = new JLabel("Text", JLabel.RIGHT);
        
        // Text nachtr�glich einf�gen
        lblText.setText("Dogs");
        
        // Text ermitteln
        System.out.println(lblText.getText());
        
        // Grafik einf�gen
        // ImageIcon erzeugen
        Icon icon = new ImageIcon("Dogs.jpg");
        
        // Label f�r Icon erstellen
        lblText.setIcon(icon);
        
        // Vertikale Ausrichtung
        lblText.setVerticalAlignment(JLabel.TOP);
        
        // Horizontale Ausrichtung
        lblText.setHorizontalAlignment(JLabel.CENTER);
        
        // Text-Icon ins Fenster integrieren
        frmMain.getContentPane().add(lblText);
        
        // optimale Gr��e 
        frmMain.pack();
        
        // Oberfl�che anzeigen
        frmMain.setVisible(true);
    }
}