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
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        JFrame fenster = new JFrame();
        
        // Titel f�r das Fenster
        fenster.setTitle("DemoJScrollPane");
         
        // ein Label f�r die Bildanzeige 
        JLabel lblBild = new JLabel(new ImageIcon("Saarschleife.jpg")); 
        
        // Anzeigekomponente in eine Instanz der Klasse JScrollPane "einpacken"
        JScrollPane scrBild = new JScrollPane(lblBild); 
          
        // Text-Icon ins Fenster integrieren
        fenster.getContentPane().add(scrBild);
        
        // optimale Gr��e 
        fenster.setSize(600, 600);
        
        // Oberfl�che anzeigen
        fenster.setVisible(true);
    }
}