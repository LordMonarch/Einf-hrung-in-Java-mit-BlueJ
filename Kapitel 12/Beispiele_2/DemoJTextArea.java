
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
    
    // Variable f�r JTextField
    private JTextArea txtArea;
    
    public static void main(String[] args)
    {
        new DemoJTextArea();
    }
    
    public DemoJTextArea()
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JTextArea");
        
        // Grundlage f�r die Komponenten
        JPanel pnlOberflaeche = new JPanel();
         
        // Instanz der Klasse JTextField
        txtArea = new JTextArea("Ich war eine Coladose", 20, 10);
        
        // Zeile umbrechen
        txtArea.setLineWrap(true);
        
        // nicht innerhalb von W�rter umbrechen
        txtArea.setWrapStyleWord(true);
                
        // ScrollPane f�r die TextArea
        JScrollPane scrText = new JScrollPane(txtArea);
        
        // Panel in das Fenster einf�gen
        frmMain.getContentPane().add(scrText);
        
        // optimale Gr��e 
        frmMain.setSize(400, 200);
        
        // Oberfl�che anzeigen
        frmMain.setVisible(true);
    }
}