/**
* Die Klasse Beispiel_4c erzeugt ein JFrame mit verschiedenen Komponenten und reagiert auf Benutzeraktionen
* Der Eventlistener ist eine anonyme Klasse
*
* @author      Florian
* @version     Kapitel 11
*/
 
import javax.swing.*;
import java.awt.event.*; 
 
public class Beispiel_4c
{   
    // eine Oberfl�che erstellen  
    private JFrame fenster = new MyFrame(); 
     
    public Beispiel_4c()
     {         
        // das Hauptmen� hinzuf�gen
        fenster.setJMenuBar(new MyMenue());        
        
        // Fenster anzeigen
        fenster.setVisible(true);    
    }
}
 