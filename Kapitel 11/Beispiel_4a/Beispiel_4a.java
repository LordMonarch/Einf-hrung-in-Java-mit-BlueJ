/**
* Die Klasse Beispiel_4a erzeugt ein JFrame mit verschiedenen Komponenten und reagiert auf Benutzeraktionen
*
* @author      Florian
* @version     Kapitel 11
*/ 
import javax.swing.*;
 
public class Beispiel_4a
{   
    // eine Oberfl�che erstellen  
    private JFrame fenster = new MyFrame();
    
    // das Hauptmen� anlegen
    private JMenuBar mnHauptmenue = new MyMenue(); 
     
     public Beispiel_4a()
     {         
        // das Hauptmen� hinzuf�gen
        fenster.setJMenuBar(mnHauptmenue);        
        
        // Fenster anzeigen
        fenster.setVisible(true);    
    }
}
 