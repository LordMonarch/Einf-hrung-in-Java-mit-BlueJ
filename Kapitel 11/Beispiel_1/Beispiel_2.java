
/**
 * Beschreiben Sie hier die Klasse Beispiel_1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import javax.swing.*;
public class Beispiel_2
{ 
   private JFrame fenster = new JFrame();
   JMenuBar mnHauptmenue = new JMenuBar();
   
   
 
   
   public static void main(String[] args)
   {
       new Beispiel_2();
    }
    
    Beispiel_2 ()
    {
        JMenu mnDatei = new JMenu("Datei");
        mnHauptmenue.add(mnDatei);
        JMenuItem mnOeffnen = new JMenuItem("Öffnen");
        JMenuItem mnBeenden = new JMenuItem("Beenden");
        
        mnDatei.add(mnOeffnen);
        mnDatei.add(mnBeenden);
        
        fenster.add(mnHauptmenue);
        fenster.setSize(300, 250);
        fenster.setLocation(150, 320);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
        fenster.setTitle("Meine erste GUI");
        
        mnDatei.setVisible(true);
        
    }
}
