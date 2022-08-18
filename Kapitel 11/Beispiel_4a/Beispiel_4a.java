/**
* Die Klasse Beispiel_4a erzeugt ein JFrame mit verschiedenen Komponenten und reagiert auf Benutzeraktionen
*
* @author      Florian
* @version     Kapitel 11
*/ 
import javax.swing.*;
 
public class Beispiel_4a
{   
    // eine Oberfläche erstellen  
    private JFrame fenster = new MyFrame();
    
    // das Hauptmenü anlegen
    private JMenuBar mnHauptmenue = new MyMenue(); 
     
     public Beispiel_4a()
     {         
        // das Hauptmenü hinzufügen
        fenster.setJMenuBar(mnHauptmenue);        
        
        // Fenster anzeigen
        fenster.setVisible(true);    
    }
}
 