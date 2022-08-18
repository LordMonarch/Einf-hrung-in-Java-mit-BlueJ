/**
 * Demonstriert die Verwendung der Klasse DemoJTextField
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class DemoJTextField extends JFrame implements ActionListener, CaretListener
{    
    // GUI
    private JFrame frmMain;
    
    // Variable f�r JTextField
    private JTextField edtEingabe;
    
    public static void main(String[] args)
    {
        new DemoJTextField();
    }
    
    public DemoJTextField()
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JTextField");
        
        // Grundlage f�r die Komponenten
        JPanel pnlOberflaeche = new JPanel();
         
        // Instanz der Klasse JTextField
        edtEingabe = new JTextField("Ich war eine Coladose", 20);
        
        // Selektion
        edtEingabe.setSelectionStart(13);
        edtEingabe.setSelectionEnd(edtEingabe.getText().length());
        
        // in die Zwischenablage kopieren
        edtEingabe.copy();
        
        // Selektion abfragen
        int anfang = edtEingabe.getSelectionStart();
        int ende = edtEingabe.getSelectionEnd();
        
        // L�nge der Selektion berechnen
        int laenge = ende - anfang;
        System.out.println("Die L�nge der Markierung: " + laenge);
        
        // Listener registrieren: 
        edtEingabe.addActionListener(this);
        edtEingabe.addCaretListener(this);
        
        // Textfeld der Oberfl�che hinzuf�gen
        pnlOberflaeche.add(edtEingabe);
        
        // Panel in das Fenster einf�gen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Gr��e 
        frmMain.setSize(400, 200);
        
        // Oberfl�che anzeigen
        frmMain.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ev)
    {
        String temp = edtEingabe.getText();
        frmMain.setTitle(temp);
    }
    
    public void caretUpdate(CaretEvent ev)
    {
        int position = edtEingabe.getCaretPosition();
        frmMain.setTitle("Position: " + position);
    }
}