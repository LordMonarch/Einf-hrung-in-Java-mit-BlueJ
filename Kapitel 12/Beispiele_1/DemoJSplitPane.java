
/**
 * Die Klasse demonstriert die Verwendung von JSplitPane
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 
import javax.swing.JSplitPane;

public class DemoJSplitPane extends JFrame
{
    public static void main(String[] args)
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        JFrame fenster = new DemoJSplitPane();
        
        // Titel für das Fenster
        fenster.setTitle("Demo JSplitPane");
        
        // Instanzen der Klasse anlegen, horizontale Ausrichtung
        // JSplitPane splitHorizontal = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        // äquivalent zu: 
        JSplitPane splitHorizontal = new JSplitPane();
        // vertikale Ausrichtung: 
        JSplitPane splitVertikal = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        
        // Pane in Fenster einfügen
        fenster.getContentPane().add(splitHorizontal);
        
        // vertikal in horizontal schachteln: 
        splitHorizontal.add(splitVertikal, JSplitPane.RIGHT);    
                
        // Instanz der Klasse JPanel erzeugen
        JPanel pnlUebersicht = new JPanel(); 
        
        // Elemente in die verschiedenen Bereich einfügen
        splitHorizontal.add(pnlUebersicht, JSplitPane.LEFT);
        splitVertikal.add(new JLabel("Hier ist die obere Seite"), JSplitPane.TOP);
        splitVertikal.add(new JLabel("Hier ist die untere Seite"), JSplitPane.BOTTOM);
                        
        // Größe festlegen
        splitHorizontal.setResizeWeight(0.5);
        splitVertikal.setResizeWeight(0.5);
        
        // optimale Größe 
        fenster.setSize(500, 400); 
        
        // Oberfläche anzeigen
        fenster.setVisible(true);
    }
}