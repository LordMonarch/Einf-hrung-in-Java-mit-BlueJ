
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 * Demonstriert die Verwendung der Klasse DemoJPasswordField
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */

public class DemoJPasswordField extends JFrame implements ActionListener, CaretListener
{    
    // GUI
    private JFrame frmMain;
    
    // Variable für JTextField
    private JPasswordField edtPasswort;
    
    public static void main(String[] args)
    {
        new DemoJPasswordField();
    }
    
    public DemoJPasswordField()
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JTextField");
        
        // Grundlage für die Komponenten
        JPanel pnlOberflaeche = new JPanel();
         
        // Instanz der Klasse JTextField
        edtPasswort = new JPasswordField("Ich war eine Coladose", 20);
        
        edtPasswort.setEchoChar('_');
        
        // Selektion abfragen
        int anfang = edtPasswort.getSelectionStart();
        int ende = edtPasswort.getSelectionEnd();
        
        // Länge der Selektion berechnen
        int laenge = ende - anfang;
        System.out.println("Die Länge der Markierung: " + laenge);
        
        // Listener registrieren: 
        edtPasswort.addActionListener(this);
        edtPasswort.addCaretListener(this);
        
        // Textfeld der Oberfläche hinzufügen
        pnlOberflaeche.add(edtPasswort);
        
        // Panel in das Fenster einfügen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Größe 
        frmMain.setSize(300, 200);
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ev)
    {
        // deprecated: String tmp = edtPasswort.getText();
        char[] passwort = edtPasswort.getPassword();
        String temp = String.valueOf(passwort);
        frmMain.setTitle(temp);
    }
    
    public void caretUpdate(CaretEvent ev)
    {
        int position = edtPasswort.getCaretPosition();        
        frmMain.setTitle("Position: " + position);
    }
}