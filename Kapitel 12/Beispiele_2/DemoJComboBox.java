
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
    
    // Variable für JTextField
    private JComboBox cmbWochentage;
    
    public static void main(String[] args)
    {
        new DemoJComboBox();
    }
    
    public DemoJComboBox()
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JComboBox");
        
        // Grundlage für die Komponenten
        JPanel pnlOberflaeche = new JPanel();
        
        // Daten zusammenstellen
        String[] data = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag"};
         
        // Instanz der Klasse JComboBox
        cmbWochentage = new JComboBox(data);
        
        // Textfeld soll editiert werden dürfen: 
        cmbWochentage.setEditable(true); 
        
        // Textfeld der Oberfläche hinzufügen
        pnlOberflaeche.add(cmbWochentage);
        
        // Panel in das Fenster einfügen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Größe 
        frmMain.setSize(400, 200);
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    } 
    
    public void uebergebeModel(ComboBoxModel cmbModel)
    {
        cmbWochentage.setModel(cmbModel);
    }
}