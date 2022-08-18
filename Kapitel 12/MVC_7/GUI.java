/**
 * Demonstriert die Verwendung von MVC in der GUI-Programmierung
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.*;  
import javax.swing.event.*;
import java.awt.event.*;

public class GUI
{  
    JList lstPlaneten; 
    JFrame fenster; 
    MainMenu mainMenu = new MainMenu();
    
    public GUI() 
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        fenster = new JFrame();
        
        // Titel für das Fenster
        fenster.setTitle("Demo JList"); 
        
        // ein Menu ezeugen
        fenster.setJMenuBar(mainMenu);
                        
        // Eine Instanz der Klasse JList erzeugen
        lstPlaneten = new JList();
        
        // Instanz in eine ScrollPane "einpacken"
        JScrollPane scrPlaneten = new JScrollPane(lstPlaneten);
        
        // Container an die Fenster-Instanz übergeben
        fenster.add(scrPlaneten);
                           
        // optimale Größe 
        fenster.pack();
        
        // Oberfläche anzeigen
        fenster.setVisible(true);
    }
}