/**
 * Die Klasse MyMenue stellt ein Menü zur Verfügung
 * 
 * @author      Florian
 * @version     Kapitel 11
 */

import javax.swing.*;

public class MyMenue extends JMenuBar
{ 
    private JMenu mnDatei = new JMenu("Datei");
        
    MyMenue()
    {
         // einen Menüpunkt generieren
         mnDatei.setMnemonic('D');
 
         // Menüpunkt dem JMenu hinzufügen
         add(mnDatei);
         
         // ein Menu-Item generieren
         JMenuItem mnOeffnen = new JMenuItem("Öffnen", 'f');
 
         // ein weiteres Menu-Item generieren
         JMenuItem mnSpeichern = new JMenuItem("Speichern", 's'); 
 
         // ein weiteres Menu-Item generieren
         JMenuItem mnSchliessen = new JMenuItem("Schließen", 'c');
 
         // ein weiteres Menu-Item generieren
         JMenuItem mnBeenden = new JMenuItem("Beenden", 'b');
 
         // die Menu-Items dem MenuBar hinzufügen
         mnDatei.add(mnOeffnen);
         mnDatei.add(mnSpeichern);
         mnDatei.add(mnSchliessen);
         mnDatei.addSeparator();
         
         // Untermenü anlegen
         JMenu mnTools = new JMenu("Tools");
         
         // Menüpunkte des Untermenüs generieren und einbinden
         JMenuItem mnRechner = new JMenuItem("Taschenrechner");
         mnTools.add(mnRechner);
 
         JMenuItem mnAdressbuch = new JMenuItem("Adressbuch");
         mnTools.add(mnAdressbuch);
  
         // Untermenü einbinden
         mnDatei.add(mnTools);
          
         // Bereich durch horizontale Linie abgrenzen
         mnDatei.addSeparator();
 
         // Menüpunkt Hintergrundfarbe
         JMenu mnHintergrundfarbe = new JMenu("Hintergrundfarbe");
 
         // Radio-Buttons
         ButtonGroup gruppe = new ButtonGroup();
 
         // RadioButton "rot"
         JRadioButtonMenuItem rot = new JRadioButtonMenuItem("rot");
         rot.setSelected(true);
         mnHintergrundfarbe.add(rot);
 
         // RadioButton "blau"
         JRadioButtonMenuItem blau = new JRadioButtonMenuItem("blau");
         mnHintergrundfarbe.add(blau);        
 
         // RadioButton "gelb"
         JRadioButtonMenuItem gelb = new JRadioButtonMenuItem("gelb");
         mnHintergrundfarbe.add(gelb);
 
         // Die Radiobuttons der Gruppe hinzufügen
         gruppe.add(rot);
         gruppe.add(blau);
         gruppe.add(gelb);
 
         // Das Menü hinzufügen 
         mnDatei.add(mnHintergrundfarbe);
 
         // Trenner hinzufügen
         mnDatei.addSeparator();  
 
         // Menüpunkt Währungen
         JMenu mnWaehrungen = new JMenu("erlaubte Währungen");
 
         // Checkboxen
         JCheckBoxMenuItem mnEuro = new JCheckBoxMenuItem("Euro");
         JCheckBoxMenuItem mnGlobo = new JCheckBoxMenuItem("Globo");

         // Checkboxen dem Menü hinzufügen
         mnWaehrungen.add(mnEuro); 
         mnWaehrungen.add(mnGlobo);
 
         // Menüpunkt "Währungen" dem Menü hinzufügen
         mnDatei.add(mnWaehrungen );
         
         // Trenner einfügen
         mnDatei.addSeparator();  
 
         // letzten Menüpunkt einfügen
         mnDatei.add(mnBeenden);
    }
}
