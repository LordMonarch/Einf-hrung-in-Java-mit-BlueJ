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
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        JFrame frmMain = new JFrame();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JRadioButton");
        
        // Grundlage f�r die Komponenten
        JPanel pnlOberflaeche = new JPanel(); 
        
        // Checkboxen zur Oberfl�che hinzuf�gen
        pnlOberflaeche.add(rdbAG);
        pnlOberflaeche.add(rdbNAG);
        
        // die Radiobuttons in einer ButtonGroup zusammenfassen
        ButtonGroup gruppe = new ButtonGroup();
        gruppe.add(rdbAG);
        gruppe.add(rdbNAG);
        
        // Eventlistener registrieren
        rdbAG.addItemListener(this);
        rdbNAG.addItemListener(this); 
        
        // Panel in das Fenster einf�gen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Gr��e 
        frmMain.setSize(200, 200);
        
        // Oberfl�che anzeigen
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