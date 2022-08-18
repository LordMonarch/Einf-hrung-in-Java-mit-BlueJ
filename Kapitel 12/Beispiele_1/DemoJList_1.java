/**
 * Demonstriert die Verwendung der Klasse JList - grunds�tzliche Verwendung: Daten einf�gen, selektieren, 
 * auf Ereignisse warten
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DemoJList_1 implements ListSelectionListener
{  
    private JList lstPlaneten;

    private class Planet
    {
        // Name des Planeten (weitere Datenfelder w�ren in der Praxis wohl anzunehmen)
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
        int index = lstPlaneten.getSelectedIndex();
        Planet temp = (Planet) lstPlaneten.getSelectedValue();
        System.out.println("Der " + (index + 1) + ". Planet ist der / die " + temp.toString());  
    }

    public DemoJList_1() 
    {
        // eine Oberfl�che wie im vorigen Beispiel erstellen
        JFrame frmMain = new JFrame();

        // Titel f�r das Fenster
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

        // Anzahl m�glicher Selektionen festlegen
        lstPlaneten.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Listener bei der JList registrieren
        lstPlaneten.addListSelectionListener(this);

        // Instanz in eine ScrollPane "einpacken"
        JScrollPane scrPlaneten = new JScrollPane(lstPlaneten);

        // ScrollPane an die Fenster-Instanz �bergeben
        frmMain.add(scrPlaneten);

        // optimale Gr��e 
        frmMain.setSize(400, 400);

        // Oberfl�che anzeigen
        frmMain.setVisible(true);
    }

    public static void main(String[] args)
    {
        new DemoJList_1();
    }    
}