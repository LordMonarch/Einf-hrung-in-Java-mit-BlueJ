
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Demonstriert die Verwendung der Klasse DemoJTextArea
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */

public class DemoJTextArea extends JFrame
{    
    // GUI
    private JFrame frmMain;
    
    // Variable für JTextField
    private JTextArea txtArea;
    
    public static void main(String[] args)
    {
        new DemoJTextArea();
    }
    
    public DemoJTextArea()
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JTextArea");
        
        // Grundlage für die Komponenten
        JPanel pnlOberflaeche = new JPanel();
         
        // Instanz der Klasse JTextField
        txtArea = new JTextArea("Ich war eine Coladose", 20, 10);
        
        // Zeile umbrechen
        txtArea.setLineWrap(true);
        
        // nicht innerhalb von Wörter umbrechen
        txtArea.setWrapStyleWord(true);
                
        // ScrollPane für die TextArea
        JScrollPane scrText = new JScrollPane(txtArea);
        
        // Panel in das Fenster einfügen
        frmMain.getContentPane().add(scrText);
        
        // optimale Größe 
        frmMain.setSize(400, 200);
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    }
}