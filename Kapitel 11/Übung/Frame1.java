
/**
 * Beschreiben Sie hier die Klasse Frame1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import javax.swing.*;
import java.awt.event.*;

public class Frame1 extends JFrame
{
  Frame1()
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
        JPanel pnlAnwendung = new JPanel();

        // Eine Schaltfläche - Button - anlegen
        JButton btnKlick1 = new JButton("Hello");
        JButton btnKlick2 = new JButton("Goodbye"); 
        

        pnlAnwendung.add(btnKlick1);
        pnlAnwendung.add(btnKlick2);
        
        getContentPane().add(pnlAnwendung);
        
        btnKlick1.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    setTitle("Hallo!");
                }
            }
        );
        
        btnKlick2.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    beenden();
                }
            }
        );
        
       
    }
     private void beenden()
        {
            System.out.println("Aufräumarbeiten");
            System.exit(0);
       }  
}
