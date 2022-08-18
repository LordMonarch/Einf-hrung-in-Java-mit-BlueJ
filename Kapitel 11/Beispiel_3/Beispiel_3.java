/**
 * Die Klasse Beispiel_3 erzeugt ein JFrame mit einem Men� und erweiterten Men�-Optionen
 *
 * @author      Florian
 * @version     Kapitel 11
 */ 

import javax.swing.*;

public class Beispiel_3
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
        new Beispiel_3();
    }   

    Beispiel_3 ()
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
        fenster. setJMenuBar(mnHauptmenue);

        // einen Men�punkt generieren
        JMenu mnDatei = new JMenu("Datei"); 
        mnDatei.setMnemonic('D');

        // Men�punkt dem JMenu hinzuf�gen
        mnHauptmenue.add(mnDatei); 

        // ein Menu-Item generieren
        JMenuItem mnOeffnen = new JMenuItem("�ffnen");

        // ein weiteres Menu-Item generieren
        JMenuItem mnSpeichern = new JMenuItem("Speichern"); 

        // ein weiteres Menu-Item generieren
        JMenuItem mnSchliessen = new JMenuItem("Schlie�en");

        // ein weiteres Menu-Item generieren
        JMenuItem mnBeenden = new JMenuItem("Beenden");

        // die Menu-Items dem MenuBar hinzuf�gen
        mnDatei.add(mnOeffnen);
        mnDatei.add(mnSpeichern);
        mnDatei.add(mnSchliessen);
        mnDatei.addSeparator();

        // Untermen� anlegen
        JMenu mnTools = new JMenu("Tools");

        // Untermen� einbinden
        mnDatei.add(mnTools);

        // Men�punkte des Untermen�s generieren und einbinden
        JMenuItem mnRechner = new JMenuItem("Taschenrechner");
        mnTools.add(mnRechner);

        JMenuItem mnAdressbuch = new JMenuItem("Adressbuch");
        mnTools.add(mnAdressbuch);

        // Bereich durch horizontale Linie abgrenzen
        mnDatei.addSeparator();

        // Men�punkt Hintergrundfarbe
        JMenu mnHintergrundfarbe = new JMenu("Hintergrundfarbe");

        // Radio-Buttons
        ButtonGroup gruppe = new ButtonGroup();
        JRadioButtonMenuItem rot = new JRadioButtonMenuItem("rot");
        rot.setSelected(true);
        mnHintergrundfarbe.add(rot);

        JRadioButtonMenuItem blau = new JRadioButtonMenuItem("blau");
        mnHintergrundfarbe.add(blau);        

        JRadioButtonMenuItem gelb = new JRadioButtonMenuItem("gelb");
        mnHintergrundfarbe.add(gelb);

        gruppe.add(rot);
        gruppe.add(blau);
        gruppe.add(gelb);

        mnDatei.add(mnHintergrundfarbe);

        mnDatei.addSeparator();  

        // Men�punkt W�hrungen
        JMenu mnWaehrungen = new JMenu("erlaubte W�hrungen");

        // Checkboxen
        JCheckBoxMenuItem mnEuro = new JCheckBoxMenuItem("Euro");
        mnWaehrungen.add(mnEuro);

        JCheckBoxMenuItem mnGlobo = new JCheckBoxMenuItem("Globo");

        mnWaehrungen.add(mnEuro);
        mnWaehrungen.add(mnGlobo);

        mnDatei.add(mnWaehrungen );
        mnDatei.addSeparator();  

        mnDatei.add(mnBeenden);

        // Fenster anzeigen
        fenster.setVisible(true);
    }
}  