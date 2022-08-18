/**
 * Demonstriert die Verwendung der Klasse JOptionPane
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */ 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DemoJOptionPane extends JFrame  
{    
    // GUI
    private JFrame frmMain;
    
    // Buttons, um die Dialoge aufzurufen
    private JButton btnConfirm = new JButton("Confirm-Dialog");    
    private JButton btnInput = new JButton("Input-Dialog");    
    private JButton btnMessage = new JButton("Message-Dialog");    
    
    public static void main(String[] args)
    {
        new DemoJOptionPane();
    }
    
    public DemoJOptionPane()
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JOptionPane");
        
        // Grundlage für die Komponenten
        JPanel pnlOberflaeche = new JPanel(); 
        
        btnConfirm.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    // JOptionPane.showConfirmDialog(null, "Sind Sie gut drauf?");
                    // JOptionPane.showConfirmDialog(null, "Sind Sie gut drauf?", "Wie geht's?", JOptionPane.YES_NO_OPTION);
                    // JOptionPane.showConfirmDialog(null, "Soll die Festplatte wirklich formatiert werden?", "Sicher?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    int antwort = JOptionPane.showConfirmDialog(null, "Soll die Festplatte wirklich formatiert werden?", "Sicher?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(antwort == JOptionPane.YES_OPTION)
                    {
                        System.out.println("Der Anwender hat <Ja> geklickt");
                    }
                    else
                    {
                        System.out.println("Der Anwender hat <Nein> geklickt");
                    } 
                }
            }
        );
        
        btnInput.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    Planet[] planeten = {new Planet("Merkur"), new Planet("Venus"), new Planet("Erde"),new Planet("Mars"), new Planet("Jupiter"), new Planet("Saturn"),new Planet("Uranus"), new Planet("Neptun")};
                    // System.out.println(JOptionPane.showInputDialog("Bitte geben Sie Ihren Namen ein:"));
                    // System.out.println(JOptionPane.showInputDialog(null, "Bitte geben Sie Ihren Namen ein:"));
                    // System.out.println(JOptionPane.showInputDialog("Bitte geben Sie Ihren Namen ein:", "Max Muster"));
                    // System.out.println(JOptionPane.showInputDialog(null, "Bitte geben Sie Ihren Namen ein:", "Max Muster"));
                    // System.out.println(JOptionPane.showInputDialog(null, planeten, "Ihr Lieblingsplanet:", JOptionPane.QUESTION_MESSAGE));
                    
                    Planet antwort = (Planet) JOptionPane.showInputDialog(null, "Bitte wählen Sie Ihren Lieblingsplaneten", "Ihr Lieblingsplanet", JOptionPane.QUESTION_MESSAGE, null, planeten, planeten[2]);
                    System.out.println(antwort);
                }
            }
        );
        
        btnMessage.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    JOptionPane.showMessageDialog(null, "Das Programm wird jetzt beendet", "Ende", JOptionPane.INFORMATION_MESSAGE);                    
                }
            }
        );
        
        // JSlider auf das Panel legen
        pnlOberflaeche.add(btnConfirm);
        pnlOberflaeche.add(btnInput);
        pnlOberflaeche.add(btnMessage);
                 
        // Panel in das Fenster einfügen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Größe 
        frmMain.pack();
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    } 
}