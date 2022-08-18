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
        // eine Oberfläche wie im vorigen Beispiel erstellen
        JFrame frmMain = new DemoJToggleButton();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JToggleButton");
        
        // Grundlage für die Komponenten
        JPanel pnlOberflaeche = new JPanel();
         
        // Button nur mit Text
        final JToggleButton btnText = new JToggleButton("Exit freischalten");
        
        // Button nur mit Icon
        JButton btnExit = new JButton(new ImageIcon("Ende.jpg"));
        
        // dem btnExit ein Tastenkürzel zuweisen
        btnExit.setMnemonic(KeyEvent.VK_Q);
        
        // Hintergrundfarbe ändern
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
        
        // Panel in das Fenster einfügen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Größe 
        frmMain.pack();
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    }
}