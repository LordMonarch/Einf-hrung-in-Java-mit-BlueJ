 
/**
* Die Klasse Beispiel_2 erzeugt ein JFrame mit einem Men� auf dem Bildschirm.
*
* @author      Florian
* @version     Kapitel 11
*/

import javax.swing.*;
 
public class Beispiel_2
{
    /*
     * Variable vom Typ JFrame - Basis f�r die Oberfl�che
     */
    private JFrame fenster = new JFrame();
        
    /*
     * Men�balken
     */
    JMenuBar mnHauptmenue = new JMenuBar();
    
    public static void main(String[] args)
    {
         new Beispiel_2();
    }   
     
    Beispiel_2 ()
    {
        // Die Gr��e des Fensters in Pixel
        fenster.setSize(300, 250);
         
        // Position festlegen
        fenster.setLocation(150, 320);
         
        // Titel einf�gen
        fenster.setTitle("Meine erste GUI");
         
        // Programm beenden, wenn Fenster geschlossen wird
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        // das Hauptmen� hinzuf�gen
        fenster.setJMenuBar(mnHauptmenue);
         
        // einen Men�punkt generieren
        JMenu mnDatei = new JMenu("Datei"); 
        mnDatei.setMnemonic('D');
 
        // Men�punkt dem JMenu hinzuf�gen
        mnHauptmenue.add(mnDatei); 
        
        // ein Menu-Item generieren
        JMenuItem mnOeffnen = new JMenuItem("�ffnen");
 
        // ein weiteres Menu-Item generieren
        JMenuItem mnSpeichern = new JMenuItem("Speichern", 's'); 
 
        // ein weiteres Menu-Item generieren
        JMenuItem mnSchliessen = new JMenuItem("Schlie�en");
 
        // ein weiteres Menu-Item generieren
        JMenuItem mnBeenden = new JMenuItem("Beenden");
 
        // die Menu-Items dem MenuBar hinzuf�gen
        mnDatei.add(mnOeffnen);
        mnDatei.add(mnSpeichern);
        mnDatei.add(mnSchliessen);
        mnDatei.addSeparator();
         
        mnDatei.add(mnBeenden);
        
        // Fenster anzeigen
        fenster.setVisible(true);
    }
} 