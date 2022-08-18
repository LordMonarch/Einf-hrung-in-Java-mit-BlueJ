 
/**
* Die Klasse Beispiel_2 erzeugt ein JFrame mit einem Menü auf dem Bildschirm.
*
* @author      Florian
* @version     Kapitel 11
*/

import javax.swing.*;
 
public class Beispiel_2
{
    /*
     * Variable vom Typ JFrame - Basis für die Oberfläche
     */
    private JFrame fenster = new JFrame();
        
    /*
     * Menübalken
     */
    JMenuBar mnHauptmenue = new JMenuBar();
    
    public static void main(String[] args)
    {
         new Beispiel_2();
    }   
     
    Beispiel_2 ()
    {
        // Die Größe des Fensters in Pixel
        fenster.setSize(300, 250);
         
        // Position festlegen
        fenster.setLocation(150, 320);
         
        // Titel einfügen
        fenster.setTitle("Meine erste GUI");
         
        // Programm beenden, wenn Fenster geschlossen wird
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        // das Hauptmenü hinzufügen
        fenster.setJMenuBar(mnHauptmenue);
         
        // einen Menüpunkt generieren
        JMenu mnDatei = new JMenu("Datei"); 
        mnDatei.setMnemonic('D');
 
        // Menüpunkt dem JMenu hinzufügen
        mnHauptmenue.add(mnDatei); 
        
        // ein Menu-Item generieren
        JMenuItem mnOeffnen = new JMenuItem("Öffnen");
 
        // ein weiteres Menu-Item generieren
        JMenuItem mnSpeichern = new JMenuItem("Speichern", 's'); 
 
        // ein weiteres Menu-Item generieren
        JMenuItem mnSchliessen = new JMenuItem("Schließen");
 
        // ein weiteres Menu-Item generieren
        JMenuItem mnBeenden = new JMenuItem("Beenden");
 
        // die Menu-Items dem MenuBar hinzufügen
        mnDatei.add(mnOeffnen);
        mnDatei.add(mnSpeichern);
        mnDatei.add(mnSchliessen);
        mnDatei.addSeparator();
         
        mnDatei.add(mnBeenden);
        
        // Fenster anzeigen
        fenster.setVisible(true);
    }
} 