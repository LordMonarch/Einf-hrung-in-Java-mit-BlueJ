
/**
 * Beschreiben Sie hier die Klasse Frame1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import javax.swing.*;
import java.awt.event.*;

public class Frame2 extends JFrame 
{
    private void set_Title(String a)
    {
        setTitle(a);
    }
    private class BtnKlickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
            if (e.getActionCommand().equals("Hello"))
                set_Title("Hallo!");
                
            if (e.getActionCommand().equals("Goodbye"))
               {
                   System.out.println("Aufräumarbeiten");
                   System.exit(0);
               }
        }
    }
  Frame2()
    {        
     Schleißen x = new Schleißen();
        // Die Größe des Fensters in Pixel
        setSize(300, 250);
 
        // Position festlegen
        setLocation(150, 320);
 
        // Programm beenden, wenn Fenster geschlossen wird
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        // Dem Fenster einen Titel geben
         
        
        // Ein Panel anlegen
        JPanel pnlAnwendung = new JPanel();

        // Eine Schaltfläche - Button - anlegen
        JButton btnKlick1 = new JButton("Hello");
        JButton btnKlick2 = new JButton("Goodbye"); 
        

        pnlAnwendung.add(btnKlick1);
        pnlAnwendung.add(btnKlick2);
        
        getContentPane().add(pnlAnwendung);
        
        ActionListener al = new BtnKlickListener();
        btnKlick1.addActionListener(al);
        btnKlick2.addActionListener(al);
        this.addWindowListener(new BeendenListener());
        
       
    }
     class BeendenListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            beenden();
        } 
    } 
    private void beenden()
    {
        System.out.println("Aufräumarbeiten");
        System.exit(0);
    }
}
