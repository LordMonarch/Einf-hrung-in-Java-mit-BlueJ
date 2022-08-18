
/**
 * Demonstriert die Verwendung der Klasse JSpinner
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */ 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class DemoJSpinner extends JFrame  
{
    private JFrame frmMain;
    
    // Variable f�r JSpinner
    private JSpinner spnTage;
    private JSpinner spnZahlen;
    private JSpinner spnDatum;
    
    public static void main(String[] args)
    {
        new DemoJSpinner();
    }
    
    public DemoJSpinner()
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        frmMain = new JFrame();
        
        // Titel f�r das Fenster
        frmMain.setTitle("Demo JSpinner");
        
        // Grundlage f�r die Komponenten
        JPanel pnlOberflaeche = new JPanel();
                
        // Wochentage in einem Array speichern: 
        String[] tage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        
        // oder eleganter: String[] tage = new DateFormatSymbols().getWeekdays();
        SpinnerModel spnModelTage = new SpinnerListModel(tage); 
         
        // Instanz der Klasse JSlider - Wertebereich 0 bis 100
        // spnTage = new JSpinner(spnModelTage);
        spnTage = new JSpinner();
        spnTage.setModel(spnModelTage); 
        
        // Parameter belegen
        int initialWert = 5;
        int minWert = 0; 
        int maxWert = 30; 
        int schrittweite = 5;
        
        // Zahlenmodel anlegen
        SpinnerNumberModel spnWerte = new SpinnerNumberModel(initialWert, minWert, maxWert, schrittweite);
        
        //JSpinner mit Zahlenwerten erzeugen
        spnZahlen = new JSpinner(spnWerte);
        
        // Datumsmodel erzeugen        
        SpinnerDateModel spnModelDatum = new SpinnerDateModel();
        
        // Spinner erzeugen
        spnDatum = new JSpinner(spnModelDatum);
        
        // einen Editor anlegen
        JSpinner.DateEditor edtrDatum = new JSpinner.DateEditor(spnDatum, "EEE, dd. MMM yyyy");
        
        // diesen Editor dem JSpinner �bergeben
        spnDatum.setEditor(edtrDatum);
        
        // JSlider auf das Panel legen
        pnlOberflaeche.add(spnTage);
        pnlOberflaeche.add(spnZahlen);
        pnlOberflaeche.add(spnDatum);
                 
        // Panel in das Fenster einf�gen
        frmMain.getContentPane().add(pnlOberflaeche);
        
        // optimale Gr��e 
        frmMain.pack();
        
        // Oberfl�che anzeigen
        frmMain.setVisible(true);
    } 
}