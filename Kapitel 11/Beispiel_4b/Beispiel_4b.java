/**
* Die Klasse Beispiel_4b erzeugt ein JFrame mit verschiedenen Komponenten und reagiert auf Benutzeraktionen
* Der Eventlistener ist eine innere Klasse
*
* @author      Florian
* @version     Kapitel 11
*/
 
import javax.swing.*;
import java.awt.event.*; 
 
public class Beispiel_4b
{   
    // eine Oberfl�che erstellen  
    private JFrame fenster = new MyFrame(); 
     
    public Beispiel_4b()
     {         
        // das Hauptmen� hinzuf�gen
        fenster.setJMenuBar(new MyMenue());        
        
        // Fenster anzeigen
        fenster.setVisible(true);    
    }
}
 