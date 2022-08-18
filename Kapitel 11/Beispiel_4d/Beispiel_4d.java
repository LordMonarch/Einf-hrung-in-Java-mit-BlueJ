/**
* Die Klasse Beispiel_4d erzeugt ein JFrame mit verschiedenen Komponenten und reagiert auf Benutzeraktionen
* Der Eventlistener ist die Frame-Klasse selbst
*
* @author      Florian
* @version     Kapitel 11
*/
 
import javax.swing.*;
import java.awt.event.*; 
 
public class Beispiel_4d
{   
    // eine Oberfl�che erstellen  
    private JFrame fenster = new MyFrame(); 
     
    public Beispiel_4d()
     {         
        // das Hauptmen� hinzuf�gen
        fenster.setJMenuBar(new MyMenue());        
        
        // Fenster anzeigen
        fenster.setVisible(true);    
    }
}
 