/**
 * Die Klasse Planetenverwaltung ist das Datenmodel
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.*;
import javax.swing.event.*;

public class Planetenverwaltung implements ListModel
{
    // die Datenbasis
    private Planet[] planeten = new Planet[9];        

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
    }
    
    @Override
    public int getSize()
    {
        return planeten.length;
    }
    
    @Override
    public Planet getElementAt(int index)
    {
        return planeten[index];
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