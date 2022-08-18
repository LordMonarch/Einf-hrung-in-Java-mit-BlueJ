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
    
    // Variable für JTextField
    private JEditorPane edpText;
    
    public static void main(String[] args)
    {
        new DemoJEditorPane();
    }
    
    public DemoJEditorPane()
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JEditorPane");
        
        // Grundlage für die Komponenten
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
        
    
        // ScrollPane für die TextArea
        JScrollPane scrText = new JScrollPane(edpText);
        
        // Panel in das Fenster einfügen
        frmMain.getContentPane().add(scrText);
        
        // optimale Größe 
        frmMain.setSize(400, 200);
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    }
}