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
        // eine Oberfläche wie im vorigen Beispiel erstellen
        JFrame frmMain = new DemoJLabel();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JLabel");
        
        // Instanzen der Klasse erzeugen: 
        // ein Label ohne Text
        JLabel lblLeer = new JLabel();
        // ein Label mit Text
        JLabel lblText = new JLabel("Text", JLabel.RIGHT);
        
        // Text nachträglich einfügen
        lblText.setText("Dogs");
        
        // Text ermitteln
        System.out.println(lblText.getText());
        
        // Grafik einfügen
        // ImageIcon erzeugen
        Icon icon = new ImageIcon("Dogs.jpg");
        
        // Label für Icon erstellen
        lblText.setIcon(icon);
        
        // Vertikale Ausrichtung
        lblText.setVerticalAlignment(JLabel.TOP);
        
        // Horizontale Ausrichtung
        lblText.setHorizontalAlignment(JLabel.CENTER);
        
        // Text-Icon ins Fenster integrieren
        frmMain.getContentPane().add(lblText);
        
        // optimale Größe 
        frmMain.pack();
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    }
}