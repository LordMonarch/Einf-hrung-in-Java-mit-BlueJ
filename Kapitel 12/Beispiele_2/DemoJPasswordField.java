
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
    
    // Variable f�r JTextField
    private JPasswordField edtPasswort;
    
    public static void main(String[] args)
    {
        new DemoJPasswordField();
    }
    
    public DemoJPasswordField()
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JTextField");
        
        // Grundlage f�r die Komponenten
        JPanel pnlOberflaeche = new JPanel();
         
        // Instanz der Klasse JTextField
        edtPasswort = new JPasswordField("Ich war eine Coladose", 20);
        
        edtPasswort.setEchoChar('_');
        
        // Selektion abfragen
        int anfang = edtPasswort.getSelectionStart();
        int ende = edtPasswort.getSelectionEnd();
        
        // L�nge der Selektion berechnen
        int laenge = ende - anfang;
        System.out.println("Die L�nge der Markierung: " + laenge);
        
        // Listener registrieren: 
        edtPasswort.addActionListener(this);
        edtPasswort.addCaretListener(this);
        
        // Textfeld der Oberfl�che hinzuf�gen
        pnlOberflaeche.add(edtPasswort);
        
        // Panel in das Fenster einf�gen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Gr��e 
        frmMain.setSize(300, 200);
        
        // Oberfl�che anzeigen
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