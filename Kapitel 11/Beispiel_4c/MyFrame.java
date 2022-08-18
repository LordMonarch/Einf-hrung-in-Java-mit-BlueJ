/**
 * Die Klasse MyFrame stellt ein JFrame zur Verfügung
 * 
 * @author      Florian
 * @version     Kapitel 11
 */
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame
{      
    // ein Label für eine Textausgabe
    private JLabel lblText;
    
    // Ein Button, wo das Event abgehört wird
    private JButton btnKlick;
    
    // JPanel, auf dem die Komponenten angeordnet werden
    private JPanel pnlAnwendung;  
    
    // Konstruktor
    MyFrame()
    {        
        // Die Größe des Fensters in Pixel
        setSize(300, 250);
 
        // Position festlegen
        setLocation(150, 320);
 
        // Programm beenden, wenn Fenster geschlossen wird
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Dem Fenster einen Titel geben
        setTitle("Meine erste GUI"); 
        
        // Ein Panel anlegen
        pnlAnwendung = new JPanel();

        // Eine Schaltfläche - Button - anlegen
        btnKlick = new JButton("Klick mich");
        
        btnKlick.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    lblText.setText("Button wurde gedrückt");
                }
            }
        );

        // Ein Label anlegen
        lblText = new JLabel("noch nicht geklickt");

        pnlAnwendung.add(btnKlick);
        pnlAnwendung.add(lblText);
        getContentPane().add(pnlAnwendung);
    }
}
