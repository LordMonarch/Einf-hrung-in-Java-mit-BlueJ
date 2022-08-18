/**
 * Die Klasse Planetenverwaltung ist das Datenmodel
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */ 
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class Planetenverwaltung implements ListModel 
{
    // die Datenbasis
    private Planet[] planeten = new Planet[9];        
    
    // Index zum Steuern des Array
    int index = 0;
    
    // Listener - wird informiert, wenn die Datenbasis sich ändert
    ListDataListener listener; 

    public Planetenverwaltung()
    {
        planeten[0] = new Planet("Merkur");
        planeten[1] = new Planet("Venus");
        planeten[2] = new Planet("Erde");
        planeten[3] = new Planet("Mars");
        planeten[4] = new Planet("Jupiter");
        planeten[5] = new Planet("Saturn");
        planeten[6] = new Planet("Uranus");
        planeten[7] = new Planet("Neptun");
        planeten[8] = new Planet("Pluto");
    }
        
    public void loeschePluto()
    {
        planeten = new Planet[8];    
        planeten[0] = new Planet("Merkur");
        planeten[1] = new Planet("Venus");
        planeten[2] = new Planet("Erde");
        planeten[3] = new Planet("Mars");
        planeten[4] = new Planet("Jupiter");
        planeten[5] = new Planet("Saturn");
        planeten[6] = new Planet("Uranus");
        planeten[7] = new Planet("Neptun");
        
        this.fireContentsChanged(this, 8, 8);
    }
    
    @Override
    public int getSize()
    {
        return planeten.length;
    }
    
    @Override
    public Planet getElementAt(int index)
    {
        String namePlanet = planeten[index].toString();
        
        if(namePlanet.equals("Pluto"))
        {
            return new Planet("---");
        }
        else
        {
            return planeten[index];
        }
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
    
    protected void fireContentsChanged(Object source, int von, int bis)
    {
        ListDataEvent event = new ListDataEvent(source, ListDataEvent.CONTENTS_CHANGED, von, bis);
        listener.contentsChanged(event);
    }
} 