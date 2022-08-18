/**
 * Demonstriert die Verwendung der Klasse JScrollPane
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JScrollPane;

public class DemoJScrollPane 
{
    public static void main(String[] args)
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        JFrame fenster = new JFrame();
        
        // Titel für das Fenster
        fenster.setTitle("DemoJScrollPane");
         
        // ein Label für die Bildanzeige 
        JLabel lblBild = new JLabel(new ImageIcon("Saarschleife.jpg")); 
        
        // Anzeigekomponente in eine Instanz der Klasse JScrollPane "einpacken"
        JScrollPane scrBild = new JScrollPane(lblBild); 
          
        // Text-Icon ins Fenster integrieren
        fenster.getContentPane().add(scrBild);
        
        // optimale Größe 
        fenster.setSize(600, 600);
        
        // Oberfläche anzeigen
        fenster.setVisible(true);
    }
}