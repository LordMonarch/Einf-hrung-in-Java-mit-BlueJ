
/**
 * Beschreiben Sie hier die Klasse Gaukler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.Observable;
public class Gaukler extends Observable
{
    private int anzahl = 5;
    private Zuschauer[] zuschauer = new Zuschauer[anzahl];
    private int arrayIndex = 0;
    
    private Assistentin assistentin = new Assistentin("Black Beauty", this);
    private final String MOTTO = "Erstaunen und Kurzweyhl";
    
    public String getMOttO()
    {
        return MOTTO;
    }
    
    public void macheWerbung()
    {
        assistentin.macheWerbung();
    }
    public void begruessen()
    {
        System.out.println("Seyd willkommen zu unserer Veranstaltung");
        System.out.println("Und das ist meine Charmante Assistentin:");
        System.out.println("\t");
        assistentin.vorstellen();
    }
    
    public void addObserver(Zuschauer besucher)
    {
        if(arrayIndex < zuschauer.length)
        {
            zuschauer[arrayIndex] = besucher;
            arrayIndex++;
            System.out.println(besucher + " wurde registriert.");
        }
        else
            System.out.println(besucher + " wurde nicht registriert.");
    }
    public void deleteObservers()
    {
        zuschauer = new Zuschauer[5];
    }
    public void deleteObserver(Zuschauer pZuschauer)
    {
        for(int i = 0; i < anzahl; i++)
        {
            if(zuschauer[i] == pZuschauer)
            {
                zuschauer[i] = null;
                System.out.println(pZuschauer + " hat sich deregistriert");
                return;
            }
        }
    }
    public void notifyObserver()
    {
        for(Zuschauer temp: zuschauer)
        {
            if(temp != null)
                temp.update(null);
        }
    }
    
    public void jonglieren()
    {
        System.out.println("Ich habe jongliert");
        setChanged();
        notifyObservers();
    }
}
