/**
 * Die Klasse Beispiel_3 erzeugt ein JFrame mit einem Menü und erweiterten Menü-Optionen
 *
 * @author      Florian
 * @version     Kapitel 11
 */ 

import javax.swing.*;

public class Beispiel_3
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
        new Beispiel_3();
    }   

    Beispiel_3 ()
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
        fenster. setJMenuBar(mnHauptmenue);

        // einen Menüpunkt generieren
        JMenu mnDatei = new JMenu("Datei"); 
        mnDatei.setMnemonic('D');

        // Menüpunkt dem JMenu hinzufügen
        mnHauptmenue.add(mnDatei); 

        // ein Menu-Item generieren
        JMenuItem mnOeffnen = new JMenuItem("Öffnen");

        // ein weiteres Menu-Item generieren
        JMenuItem mnSpeichern = new JMenuItem("Speichern"); 

        // ein weiteres Menu-Item generieren
        JMenuItem mnSchliessen = new JMenuItem("Schließen");

        // ein weiteres Menu-Item generieren
        JMenuItem mnBeenden = new JMenuItem("Beenden");

        // die Menu-Items dem MenuBar hinzufügen
        mnDatei.add(mnOeffnen);
        mnDatei.add(mnSpeichern);
        mnDatei.add(mnSchliessen);
        mnDatei.addSeparator();

        // Untermenü anlegen
        JMenu mnTools = new JMenu("Tools");

        // Untermenü einbinden
        mnDatei.add(mnTools);

        // Menüpunkte des Untermenüs generieren und einbinden
        JMenuItem mnRechner = new JMenuItem("Taschenrechner");
        mnTools.add(mnRechner);

        JMenuItem mnAdressbuch = new JMenuItem("Adressbuch");
        mnTools.add(mnAdressbuch);

        // Bereich durch horizontale Linie abgrenzen
        mnDatei.addSeparator();

        // Menüpunkt Hintergrundfarbe
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

        // Menüpunkt Währungen
        JMenu mnWaehrungen = new JMenu("erlaubte Währungen");

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