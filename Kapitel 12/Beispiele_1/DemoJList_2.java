/**
 * Demonstriert die Verwendung der Klasse DemoJList_2 - die Arbeit mit Modellen
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.*;  
import javax.swing.event.*;

public class DemoJList_2 implements ListSelectionListener
{  
    private JList lstPlaneten;

    private class Planet
    {
        // Name des Planeten (weitere Datenfelder wären in der Praxis wohl anzunehmen)
        private String name; 
        
        // Konstruktor
        public Planet(String name)
        {
            this.name = name; 
        }
       
        @Override
        public String toString()
        {
            return name;
        }
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        if(lstPlaneten.isSelectedIndex(8))
        {
            lstPlaneten.clearSelection();
        }
        else if(!lstPlaneten.isSelectionEmpty())
        {
            int index = lstPlaneten.getSelectedIndex();    
            Planet temp = (Planet) lstPlaneten.getSelectedValue();          
            System.out.println("Der " + (index+1) + ". Planet ist der " + temp.toString()); 
        }
    }
    
    public DemoJList_2() 
    {
        // eine Oberfläche wie im vorigen Beispiel erstellen
        JFrame frmMain = new JFrame();
        
        // Titel für das Fenster
        frmMain.setTitle("Demo JList");
        
        // Array von Planeten anlegen
        Planet[] planeten = new Planet[]
            {  
                new Planet("Merkur"),
                new Planet("Venus"),
                new Planet("Erde"), 
                new Planet("Mars"), 
                new Planet("Jupiter"),
                new Planet("Saturn"),
                new Planet("Uranus"),
                new Planet("Neptun"),
                new Planet("Pluto")
            };

        
        // Eine Instanz der Klasse JList erzeugen
        lstPlaneten = new JList(planeten);
        
        // Anzahl möglicher Selektionen festlegen
        lstPlaneten.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Listener bei der JList registrieren
        lstPlaneten.addListSelectionListener(this);
        
        // Instanz in eine ScrollPane "einpacken"
        JScrollPane scrPlaneten = new JScrollPane(lstPlaneten);
        
        // das Model beziehen
        ListModel model = lstPlaneten.getModel();
        
        // ScrollPane an die Fenster-Instanz übergeben
        frmMain.add(scrPlaneten);
                           
        // optimale Größe 
        frmMain.setSize(400, 400);
        
        // Oberfläche anzeigen
        frmMain.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new DemoJList_2();
    }    
}