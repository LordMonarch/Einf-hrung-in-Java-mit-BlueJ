/**
 * Demonstriert die Verwendung eines JPanel
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class DemoJPanel
{
    public static void main(String[] args)
    {
        // Instanz der Klasse JFrame
        JFrame frmMain = new JFrame(); 

        // Titel setzen
        frmMain.setTitle("Demo JPanel");

        // sichtbar machen und anzeigen
        frmMain.setVisible(true);

        // Programm beenden, wenn Fenster geschlossen wird
        frmMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Instanz der Klasse JPanel erzeugen
        JPanel pnlMain = new JPanel();

        // Border-Instanz bekommen 
        // Border border = BorderFactory.createTitledBorder("Rahmen um das Panel");
        Border border = BorderFactory.createTitledBorder(null, "Rahmen um das Panel", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);

        // Border an die Komponente übergeben
        pnlMain.setBorder(border);

        // einen Button anlegen
        JButton btnKlick = new JButton("Klick mich");

        // Tooltip des Buttons definieren: 
        btnKlick.setToolTipText("Klick einfach mal drauf!");

        // Tooltip des Labels definieren: 
        pnlMain.setToolTipText("Die Maus ist nicht über dem Button.");

        // Hintergrundfarben der Komponenten
        btnKlick.setBackground(Color.LIGHT_GRAY);
        pnlMain.setBackground(Color.WHITE);

        // den Button einfügen
        pnlMain.add(btnKlick);

        // Instanz dem Fenster hinzufügen
        frmMain.getContentPane().add(pnlMain);

        // optimale Größe 
        frmMain.pack();

        // Oberfläche anzeigen
        frmMain.setVisible(true);
    }
}
