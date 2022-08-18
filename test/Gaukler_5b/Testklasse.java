
/**
 * Testet die Klassen Gaukler und Zuschauer
 * 
 * @author      Florian
 * @version     Kapitel 10
 */
public class Testklasse
{
    public static void main(String[] args)
    {
        Gaukler merlin = new Gaukler();
        Gaukler.Assistentin maren = merlin.new Assistentin("Black Angel");
        merlin.setAssistentin(maren);
        // nur zulässig, wenn die innere Klasse public ist:  
        Marktbesucher fritz = new Marktbesucher("Fritz");
        Marktbesucher franz = new Marktbesucher("Franz");
        Marktbesucher frieda = new Marktbesucher("Frieda");
        Marktbesucher hans = new Marktbesucher("Hans");
        Marktbesucher heinz = new Marktbesucher("Heinz");
        Marktbesucher hanna = new Marktbesucher("Hanna");
                
        // Die Assistentin macht Werbung für die Veranstaltung
        maren.vorstellen();
        maren.macheWerbung();
        
        // Der Gaukler begrüßt die Zuschauer
        // erwartet: Ausgaben von Gaukler und Assistentin
        merlin.begruessen();
        
        // erwartet: kann sich registrieren
        merlin.addObserver(fritz); 
        merlin.addObserver(franz); 
        merlin.addObserver(frieda); 
        merlin.addObserver(hans); 
        merlin.addObserver(heinz);       
        merlin.addObserver(hanna); 
        
        System.out.println("\nJetzt wird der Gaukler ein Kunststück vorführen");        
        // Aktionen durchführen 
        // erwartet: alle registrierten Zuschauer werden informiert
        merlin.jonglieren();
        
        // einen Besucher de-registrieren
        // erwartet: Franz de-registriert sich selbst
        merlin.deleteObserver(franz); 
                
        System.out.println("\nJetzt wird der Gaukler noch ein Kunststück vorführen");    
        // Aktionen durchführen 
        // erwartet: alle außer Franz werden informiert
        merlin.jonglieren();
        
    }
}
