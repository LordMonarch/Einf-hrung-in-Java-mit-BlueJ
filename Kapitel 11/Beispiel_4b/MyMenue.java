/**
 * Die Klasse MyMenue stellt ein Men� zur Verf�gung
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
         // einen Men�punkt generieren
         mnDatei.setMnemonic('D');
 
         // Men�punkt dem JMenu hinzuf�gen
         add(mnDatei);
         
         // ein Menu-Item generieren
         JMenuItem mnOeffnen = new JMenuItem("�ffnen", 'f');
 
         // ein weiteres Menu-Item generieren
         JMenuItem mnSpeichern = new JMenuItem("Speichern", 's'); 
 
         // ein weiteres Menu-Item generieren
         JMenuItem mnSchliessen = new JMenuItem("Schlie�en", 'c');
 
         // ein weiteres Menu-Item generieren
         JMenuItem mnBeenden = new JMenuItem("Beenden", 'b');
 
         // die Menu-Items dem MenuBar hinzuf�gen
         mnDatei.add(mnOeffnen);
         mnDatei.add(mnSpeichern);
         mnDatei.add(mnSchliessen);
         mnDatei.addSeparator();
         
         // Untermen� anlegen
         JMenu mnTools = new JMenu("Tools");
         
         // Men�punkte des Untermen�s generieren und einbinden
         JMenuItem mnRechner = new JMenuItem("Taschenrechner");
         mnTools.add(mnRechner);
 
         JMenuItem mnAdressbuch = new JMenuItem("Adressbuch");
         mnTools.add(mnAdressbuch);
  
         // Untermen� einbinden
         mnDatei.add(mnTools);
          
         // Bereich durch horizontale Linie abgrenzen
         mnDatei.addSeparator();
 
         // Men�punkt Hintergrundfarbe
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
 
         // Die Radiobuttons der Gruppe hinzuf�gen
         gruppe.add(rot);
         gruppe.add(blau);
         gruppe.add(gelb);
 
         // Das Men� hinzuf�gen 
         mnDatei.add(mnHintergrundfarbe);
 
         // Trenner hinzuf�gen
         mnDatei.addSeparator();  
 
         // Men�punkt W�hrungen
         JMenu mnWaehrungen = new JMenu("erlaubte W�hrungen");
 
         // Checkboxen
         JCheckBoxMenuItem mnEuro = new JCheckBoxMenuItem("Euro");
         JCheckBoxMenuItem mnGlobo = new JCheckBoxMenuItem("Globo");

         // Checkboxen dem Men� hinzuf�gen
         mnWaehrungen.add(mnEuro); 
         mnWaehrungen.add(mnGlobo);
 
         // Men�punkt "W�hrungen" dem Men� hinzuf�gen
         mnDatei.add(mnWaehrungen );
         
         // Trenner einf�gen
         mnDatei.addSeparator();  
 
         // letzten Men�punkt einf�gen
         mnDatei.add(mnBeenden);
    }
}
