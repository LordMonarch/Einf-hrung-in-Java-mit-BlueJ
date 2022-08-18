/**
 * Die Klasse MyFrame stellt ein JFrame zur Verf�gung
 * 
 * @author      Florian
 * @version     Kapitel 11
 */
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame
{      
    // ein Label f�r eine Textausgabe
    private JLabel lblText;
    
    // Die Variablen f�r die beiden Buttons
    private JButton btnHello;
    private JButton btnGoodbye;
    
    // JPanel, auf dem die Komponenten angeordnet werden
    private JPanel pnlAnwendung;  
    
    class HelloListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ev)
        {
            setTitle("Hallo");
        }        
    }
    
    class GoodbyeListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent ev)
        {
            beenden();
        }
    } 
     
    class BeendenListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            beenden();
        } 
    } 
    
    // Konstruktor
    MyFrame()
    {        
        // Die Gr��e des Fensters in Pixel
        setSize(500, 500);
 
        // Programm beenden, wenn Fenster geschlossen wird
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Dem Fenster einen Titel geben
        setTitle("Meine erste GUI"); 
        
        // Ein Panel anlegen
        pnlAnwendung = new JPanel();

        // Eine Schaltfl�che - Button - anlegen
        btnHello = new JButton("Hello");
        btnGoodbye = new JButton("Goodbye");
             
        btnHello.addActionListener(new HelloListener());
        btnGoodbye.addActionListener(new GoodbyeListener());   

        pnlAnwendung.add(btnHello);
        pnlAnwendung.add(btnGoodbye);
        getContentPane().add(pnlAnwendung);
        
        this.addWindowListener(new BeendenListener());
    }
    
    private void beenden()
    {
        System.out.println("Aufr�umarbeiten");
        System.exit(0);
    }
}
