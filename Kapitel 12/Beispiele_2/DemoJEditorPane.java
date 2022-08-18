/**
 * Demonstriert die Verwendung der Klasse DemoJEditorPane
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.html.HTMLEditorKit;

public class DemoJEditorPane extends JFrame
{    
    // GUI
    private JFrame frmMain;
    
    // Variable f�r JTextField
    private JEditorPane edpText;
    
    public static void main(String[] args)
    {
        new DemoJEditorPane();
    }
    
    public DemoJEditorPane()
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JEditorPane");
        
        // Grundlage f�r die Komponenten
        JPanel pnlOberflaeche = new JPanel();
         
        // Instanz der Klasse JTextField
        edpText = new JEditorPane();
        
        // Text darf nicht editiert werden
        edpText.setEditable(false);
        
        // EditorKit installieren
        HTMLEditorKit editorKit = new HTMLEditorKit();
        edpText.setEditorKit(editorKit);
        
        try
        {
            edpText.setPage("http://www.BlueJ-Buch.de");
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
        
    
        // ScrollPane f�r die TextArea
        JScrollPane scrText = new JScrollPane(edpText);
        
        // Panel in das Fenster einf�gen
        frmMain.getContentPane().add(scrText);
        
        // optimale Gr��e 
        frmMain.setSize(400, 200);
        
        // Oberfl�che anzeigen
        frmMain.setVisible(true);
    }
}