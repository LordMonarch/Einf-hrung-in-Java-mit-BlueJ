
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.*;
import java.text.*;
public class Datum
{
    public static void getDatum()
    {
        // gibt aktuellen Zeitpunkt an
        Date d = new Date();
        System.out.println(d);
        
        // Formatierte Datumsausgabe Tag als Zahl, Monat als Wort, Jahr als Zahl
        SimpleDateFormat sf = new SimpleDateFormat("dd. MMMM yyyy, 'um 'HH:MM' Uhr '");
        String s = sf.format(d);
        System.out.println(s);
        
        System.out.println(TimeZone.getDefault());
    }
}
