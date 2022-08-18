
/**
 * Demonstriert die Verwendung von JTabbedPane
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class DemoJTabbedPane extends JFrame
{  
    public static void main(String[] args)
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        JFrame frmMain = new DemoJTabbedPane();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JTabbedPane");
        
        // Instanz der Klasse anlegen
        JTabbedPane tbbMain = new JTabbedPane(JTabbedPane.LEFT);
        
        // Pane in Fenster einf�gen
        frmMain.getContentPane().add(tbbMain);
        
        // Ein paar Unter-Container in das TabbedPane einf�gen:
        for (int i = 0; i < 5; i++)
        {
            String nummer = "Panel Nr. " + i;
            JPanel pnlTemp = new JPanel();
            JLabel lblTemp = new JLabel(nummer);
            pnlTemp.add(lblTemp);
            tbbMain.add(nummer, pnlTemp);
        } 
        
        // Und jetzt noch einen Button: 
        tbbMain.add("Ein gro�er Button", new JButton("Klick mich!"));
        
        // ersten Tab entfernen
        tbbMain.remove(0);
        
        // optimale Gr��e 
        frmMain.setSize(500, 400);
        
        // Oberfl�che anzeigen
        frmMain.setVisible(true);        
    }
}
