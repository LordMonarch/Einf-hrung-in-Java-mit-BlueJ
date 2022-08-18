/**
 * Demonstriert die Verwendung der Klasse DemoJRadioButton
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.*;  
import javax.swing.border.*;
import java.awt.event.*;

public class DemoJRadioButton implements ItemListener
{
    // Die Checkboxen
    private JRadioButton rdbAG = new JRadioButton("Alkoholisch");  
    private JRadioButton rdbNAG = new JRadioButton("Nicht-Alkoholisch", true); 
        
    public DemoJRadioButton()
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        JFrame frmMain = new JFrame();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JRadioButton");
        
        // Grundlage für die Komponenten
        JPanel pnlOberflaeche = new JPanel(); 
        
        // Checkboxen zur Oberfläche hinzufügen
        pnlOberflaeche.add(rdbAG);
        pnlOberflaeche.add(rdbNAG);
        
        // die Radiobuttons in einer ButtonGroup zusammenfassen
        ButtonGroup gruppe = new ButtonGroup();
        gruppe.add(rdbAG);
        gruppe.add(rdbNAG);
        
        // Eventlistener registrieren
        rdbAG.addItemListener(this);
        rdbNAG.addItemListener(this); 
        
        // Panel in das Fenster einfügen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Größe 
        frmMain.setSize(200, 200);
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new DemoJRadioButton();
    }
    
    public void itemStateChanged(ItemEvent ev)
    {
        JRadioButton temp = (JRadioButton) ev.getSource();
        if(temp.isSelected())
        {
            if(temp == rdbNAG)
                System.out.println("Der Kunde will was Nicht-Alkoholisches!");
            else  
                System.out.println("Der Kunde will nen Bier!"); 
        }
    }
}