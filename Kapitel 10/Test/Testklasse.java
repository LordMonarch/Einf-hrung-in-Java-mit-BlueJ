
/**
 * Beschreiben Sie hier die Klasse Testklasse.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Testklasse
{
   public static void main(String[] args)
   {
       Gaukler gaukler = new Gaukler();
       Marktbesucher fritz = new Marktbesucher("Fritz");
       Marktbesucher franz = new Marktbesucher("Franz");
       Marktbesucher frieda = new Marktbesucher("Frieda");
       Marktbesucher hans = new Marktbesucher("Hans");
       Marktbesucher heinz = new Marktbesucher("Heinz");
       Marktbesucher hanna = new Marktbesucher("Hanna");
       //erwartet: kann sich registrieren
       gaukler.addObserver(fritz);
       gaukler.addObserver(franz);
       gaukler.addObserver(frieda);
       gaukler.addObserver(hans);
       gaukler.addObserver(heinz);
       //Aktion durchführen
       //erwartet: alle bekannten Zuschauer werden informiert
       gaukler.jonglieren();
       //erwartet: kann sich nicht registrieren
       gaukler.addObserver(hanna);
       System.out.println("\nJetzt wird der Gaukler ein Kunststück vorführen");
       //Aktion durchführen
       //erwartet: registrierte Zuschauer werden informiert
       gaukler.jonglieren();
       //einen Besucher deregitrieren
       //erwartet: Franz deregistriert sich selbst
       gaukler.deleteObserver(franz);
       System.out.println("\nJetzt wird der Gaukler noch ein Kunststück vorführen");
       //Aktionen durchführen
       //erwartet: alle außer Franz werden informiert
       gaukler.jonglieren();
   }
}
