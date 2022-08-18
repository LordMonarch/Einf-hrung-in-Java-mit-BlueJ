
/**
 * Beschreiben Sie hier die Klasse MyFrame.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame
{
    private JMenuBar mnHauptmenue = new JMenuBar();
    private JRadioButtonMenuItem rot;
    private JRadioButtonMenuItem blau;
    private JRadioButtonMenuItem gelb;
    
    MyFrame()
    {
        setSize(300, 250);
        setLocation(150, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(mnHauptmenue);
        setTitle("Meine Hintergrundänder GUI");
        
        JMenu mnDatei = new JMenu("Datei");
        JMenu mnTools = new JMenu("Tools"); // Untermenüs
        JMenu mnHintergrundfarbe = new JMenu("Hintergrundfarbe");
        mnHauptmenue.add(mnDatei);
        mnDatei.setMnemonic('D');
        
        gelb = new JRadioButtonMenuItem("gelb");
        blau = new JRadioButtonMenuItem("blau");
        rot = new JRadioButtonMenuItem("rot"); 
        
        
        
        JMenuItem mnOeffnen = new JMenuItem("Öffnen");
        JMenuItem mnBeenden = new JMenuItem("Beenden");
        JMenuItem mnSpeichern = new JMenuItem("Speicher");
        JMenuItem mnSchliessen = new JMenuItem("Schliessen");
        JMenuItem mnRechner = new JMenuItem("Taschenrechner");
        JMenuItem mnAdressbuch = new JMenuItem("Adressbuch");
        
   
        
        mnHintergrundfarbe.add(gelb);
        mnHintergrundfarbe.add(blau);
        mnHintergrundfarbe.add(rot);
        
        ButtonGroup gruppe = new ButtonGroup();
        gruppe.add(gelb);
        gruppe.add(blau);
        gruppe.add(rot);
        rot.setSelected(true);
        
        mnDatei.add(mnOeffnen);
        mnDatei.add(mnSpeichern);
        mnDatei.add(mnSchliessen);
        mnDatei.addSeparator(); // Trennlinie
        mnDatei.add(mnHintergrundfarbe);
        mnDatei.addSeparator(); // Trennlinie
        mnDatei.add(mnBeenden);
        
      ItemListener itemListener = new MyItemListener();   //Innere Klasse
        gelb.addItemListener(itemListener);
        blau.addItemListener(itemListener);
        rot.addItemListener(itemListener);
        
        
        setVisible(true);
    }
   
      private void aendernFarbe(Color color)
        {
            this.getContentPane().setBackground(color);
        }
        
        private class MyItemListener implements ItemListener
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                JRadioButtonMenuItem temp = (JRadioButtonMenuItem)e.getItem();
                
                if(rot.isSelected())
                    aendernFarbe(Color.RED);
                else
                    if(blau.isSelected())
                        aendernFarbe(Color.BLUE);
                    else
                        aendernFarbe(Color.YELLOW);
            }
        }
}
