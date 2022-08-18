
/**
 * Modelliert einen Gaukler - in dieser Version werden die Java-eigenen Klassen verwendet
 * 
 * @author      Florian 
 * @version     Kapitel 10
 */

import java.util.Observable;

public class Gaukler extends Observable
{ 
    /**
     * Referenz auf die Assistentin des Gauklers
     */
    private Assistentin assistentin = new Assistentin("Black Beauty", this); 
    /**
     * Enthält das Motto der Veranstaltung
     */
    private final String MOTTO = "Erstaunen und Kurzweyhl";

    /**
     * Macht Werbung für die Veranstaltung
     */
    public void macheWerbung()
    {
        assistentin.macheWerbung();
    }
    
    /**
     * Begrüßt die Zuschauer
     */
    public void begruessen()
    {
        System.out.println("Seyd willkommen zu unserer Verstaltung");
        System.out.println("Und das ist meine charmante Assistentin:");
        System.out.print("\t");
        assistentin.vorstellen();
    }
    
    /**
     * Gibt das Motto der Veranstaltung zurück 
     * @return Motto der Veranstaltung
     */
    public String getMotto()
    {
        return MOTTO;
    }
    
    /**
     * Führt eine Aktion aus und informiert die Zuschauer
     */
    public void jonglieren()
    {
        System.out.println("Ich habe jongliert");
        setChanged();
        notifyObservers();
    }
}