/**
 * Demonstriert die Verwendung der Klasse DemoJButton
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class DemoJButton extends JFrame
{
    public static void main(String[] args)
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        JFrame frmMain = new DemoJButton();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JButton");
        
        // Grundlage f�r die Komponenten
        JPanel pnlOberflaeche = new JPanel();
         
        // Button nur mit Text
        JButton btnText = new JButton("Klick hier");
        
        // Button nur mit Icon
        JButton btnExit = new JButton(new ImageIcon("Ende.jpg"));
        
        // dem btnExit ein Tastenk�rzel zuweisen
        btnExit.setMnemonic(KeyEvent.VK_Q);
        
        // den Standard-Button des Fensters definieren
        frmMain.getRootPane().setDefaultButton(btnExit);
        
        // Hintergrundfarbe �ndern
        btnExit.setBackground(Color.WHITE);
        
        // AktionListener implementieren
        btnExit.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    System.exit(0);
                }
        }
        );
                
        // Button mit Icon und Text 
        JButton btnBeides = new JButton("Cat-Klick", new ImageIcon("Katze_klein.jpg"));
                
        // Buttons in das Panel integrieren
        pnlOberflaeche.add(btnText);
        pnlOberflaeche.add(btnExit);
        pnlOberflaeche.add(btnBeides);
        
        // Panel in das Fenster einf�gen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Gr��e 
        frmMain.pack();
        
        // Oberfl�che anzeigen
        frmMain.setVisible(true);
    }
}