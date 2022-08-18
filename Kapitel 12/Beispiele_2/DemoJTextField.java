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
    
    // Variable für JTextField
    private JTextField edtEingabe;
    
    public static void main(String[] args)
    {
        new DemoJTextField();
    }
    
    public DemoJTextField()
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JTextField");
        
        // Grundlage für die Komponenten
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
        
        // Länge der Selektion berechnen
        int laenge = ende - anfang;
        System.out.println("Die Länge der Markierung: " + laenge);
        
        // Listener registrieren: 
        edtEingabe.addActionListener(this);
        edtEingabe.addCaretListener(this);
        
        // Textfeld der Oberfläche hinzufügen
        pnlOberflaeche.add(edtEingabe);
        
        // Panel in das Fenster einfügen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Größe 
        frmMain.setSize(400, 200);
        
        // Oberfläche anzeigen
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