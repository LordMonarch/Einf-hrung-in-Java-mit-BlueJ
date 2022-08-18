
/**
 * Beschreiben Sie hier die Klasse Beispiel_1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import javax.swing.*;
public class Beispiel_1
{
   private JFrame fenster = new JFrame();
   
   public static void main(String[] args)
   {
       new Beispiel_1();
    }
    
    Beispiel_1 ()
    {
        fenster.setSize(300, 250);
        fenster.setLocation(150, 320);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
        fenster.setTitle("Meine erste GUI");
    }
}
