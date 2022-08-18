/**
 * Demonstriert die Verwendung der Klasse DemoJList_3 - die Arbeit mit Modellen
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DemoJList_3 implements ListSelectionListener
{  
    private JList lstPlaneten;
    
    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        int index = lstPlaneten.getSelectedIndex();    
        Planet temp = (Planet) lstPlaneten.getSelectedValue();          
        System.out.println("Der " + (index+1) + ". Planet heißt " + temp); 
    }
    
    public DemoJList_3() 
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        JFrame frmMain = new JFrame();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JList");
        
        // Eine Instanz der Klasse JList erzeugen
        // lstPlaneten = new JList(new Planetenverwaltung());
        lstPlaneten = new JList();
        
        // Anzahl möglicher Selektionen festlegen
        lstPlaneten.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Listener bei der JList registrieren
        lstPlaneten.addListSelectionListener(this);
        
        // Instanz in eine ScrollPane "einpacken"
        JScrollPane scrPlaneten = new JScrollPane(lstPlaneten);
        
        // Container an die Fenster-Instanz übergeben
        frmMain.add(scrPlaneten);
                           
        // optimale Größe 
        frmMain.pack();
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    }
    
    public void setDatenmodell(ListModel daten)
    {
        ListModel datenmodell = daten; 
        lstPlaneten.setModel(datenmodell);
    }
}