
/**
 * Demonstriert die Verwendung der Klasse DemoJComboBox
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoJComboBox extends JFrame 
{    
    // GUI
    private JFrame frmMain;
    
    // Variable f�r JTextField
    private JComboBox cmbWochentage;
    
    public static void main(String[] args)
    {
        new DemoJComboBox();
    }
    
    public DemoJComboBox()
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JComboBox");
        
        // Grundlage f�r die Komponenten
        JPanel pnlOberflaeche = new JPanel();
        
        // Daten zusammenstellen
        String[] data = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag"};
         
        // Instanz der Klasse JComboBox
        cmbWochentage = new JComboBox(data);
        
        // Textfeld soll editiert werden d�rfen: 
        cmbWochentage.setEditable(true); 
        
        // Textfeld der Oberfl�che hinzuf�gen
        pnlOberflaeche.add(cmbWochentage);
        
        // Panel in das Fenster einf�gen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Gr��e 
        frmMain.setSize(400, 200);
        
        // Oberfl�che anzeigen
        frmMain.setVisible(true);
    } 
    
    public void uebergebeModel(ComboBoxModel cmbModel)
    {
        cmbWochentage.setModel(cmbModel);
    }
}