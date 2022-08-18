
/**
 * Die Klasse ComboWochentage ist das Datenmodel für die JComboBox
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class ComboWochentage implements ComboBoxModel
{
    // die Datenbasis
    private String[] tage;
    // Index zum Steuern des Array
    int index = 0;
    // Listener - wird informiert, wenn die Datenbasis sich ändert
    ListDataListener listener;

    // Methoden der Schnittstelle ComboBoxModel
    @Override
    public Object getSelectedItem()
    {
        // nicht implementiert
        return null;
    }

    @Override
    public void setSelectedItem(Object anItem)
    {
        // nicht implementiert
    }

    // Konstruktor 
    public ComboWochentage()
    {
        tage = new String[]
                {
                    "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"
                };
    }

    // eigene Methoden des Datenmodells 
    public void loescheArbeitstage()
    {
        tage = new String[2];
        tage[0] = "Samstag";
        tage[1] = "Sonntag";

        this.fireContentsChanged(this, 0, 6);
    }

    protected void fireContentsChanged(Object source, int von, int bis)
    {
        ListDataEvent event = new ListDataEvent(source, ListDataEvent.CONTENTS_CHANGED, von, bis);
        listener.contentsChanged(event);
    }

    // Methoden der Schnittstelle ListModel
    @Override
    public int getSize()
    {
        return tage.length;
    }

    @Override
    public String getElementAt(int index)
    {
        return tage[index];
    }

    @Override
    public void addListDataListener(ListDataListener listener)
    {
        this.listener = listener;
    }

    @Override
    public void removeListDataListener(ListDataListener listener)
    {
        // in der derzeitigen Implementierung nicht vorgesehen
    }
}
