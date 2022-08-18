/**
 * Demonstriert die Verwendung der Klasse DemoJToggleButton
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class DemoJToggleButton extends JFrame
{
    public static void main(String[] args)
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        JFrame frmMain = new DemoJToggleButton();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JToggleButton");
        
        // Grundlage f�r die Komponenten
        JPanel pnlOberflaeche = new JPanel();
         
        // Button nur mit Text
        final JToggleButton btnText = new JToggleButton("Exit freischalten");
        
        // Button nur mit Icon
        JButton btnExit = new JButton(new ImageIcon("Ende.jpg"));
        
        // dem btnExit ein Tastenk�rzel zuweisen
        btnExit.setMnemonic(KeyEvent.VK_Q);
        
        // Hintergrundfarbe �ndern
        btnExit.setBackground(Color.WHITE);
        
        // AktionListener implementieren
        btnExit.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    if(btnText.isSelected())
                    {
                        System.exit(0);
                    }
                }
            }
        ); 
        
        btnText.addItemListener
        (
            new ItemListener()
            {
                public void itemStateChanged(ItemEvent ev)
                {
                    if(btnText.isSelected())
                    {
                        System.out.println("Der Exit-Button ist aktiviert.");
                    }
                    else
                    {
                        System.out.println("Der Exit-Button ist de-aktiviert");
                    }
                }
            }
        );
                
        // Buttons in das Panel integrieren
        pnlOberflaeche.add(btnText);
        pnlOberflaeche.add(btnExit); 
        
        // Panel in das Fenster einf�gen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Gr��e 
        frmMain.pack();
        
        // Oberfl�che anzeigen
        frmMain.setVisible(true);
    }
}