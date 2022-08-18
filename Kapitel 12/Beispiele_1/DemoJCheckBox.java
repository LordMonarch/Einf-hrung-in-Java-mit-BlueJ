/**
 * Demonstriert die Verwendung der Klasse DemoJCheckBox
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.*;  
import javax.swing.border.*;
import java.awt.event.*;

public class DemoJCheckBox implements ItemListener
{
    // Die Checkboxen
    private JCheckBox chkBier = new JCheckBox("Bier"); 
    private JCheckBox chkLimo = new JCheckBox("Limo"); 
    private JCheckBox chkWurst = new JCheckBox("Wurst", true); 

    public DemoJCheckBox()
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        JFrame fenster = new JFrame();

        // Titel für das Fenster
        fenster.setTitle("Demo JCheckBox");

        // Grundlage für die Komponenten
        JPanel pnlOberflaeche = new JPanel(); 

        // Border für das Panel erstellen
        Border border = BorderFactory.createTitledBorder(null, "Geben Sie Ihre Bestellung auf:", TitledBorder.CENTER, TitledBorder.BELOW_TOP);

        // Border dem Panel übergeben
        pnlOberflaeche.setBorder(border);

        // Checkboxen zur Oberfläche hinzufügen
        pnlOberflaeche.add(chkBier);
        pnlOberflaeche.add(chkLimo);
        pnlOberflaeche.add(chkWurst);         

        chkBier.addItemListener(this);
        chkLimo.addItemListener(this);
        chkWurst.addItemListener(this);

        // Panel in das Fenster einfügen
        fenster.getContentPane().add(pnlOberflaeche);

        // optimale Größe 
        fenster.setSize(200, 200);

        // Oberfläche anzeigen
        fenster.setVisible(true);
    }

    public static void main(String[] args)
    {
        new DemoJCheckBox();
    }

    public void itemStateChanged(ItemEvent ev)
    {
        JCheckBox temp = (JCheckBox) ev.getSource();
        if(temp.isSelected())
        {
            if(temp == chkBier)
                System.out.println("Der Kunde will 'nen Bier!");
            else if (temp == chkLimo)
                System.out.println("Der Kunde will 'ne Limo!");
            else 
                System.out.println("Der Kunde will 'ne Wurst!");
        }
    }
}