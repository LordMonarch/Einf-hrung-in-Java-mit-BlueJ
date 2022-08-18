
/**
 * Beschreiben Sie hier die Klasse Zweite_Übung_zu_if_else.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zweite_Übung_zu_if_else
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    static public void main(String[] args){
    int j = 1;
    if (++j == 4 && ++j == (1 + 2))
        System.out.println("Erstes if");
    else
            if (j++ == 4 || j == 3)
            System.out.println("Zweites if");
            else
                if (j == 4 && 1 == 3 + 4)
                    System.out.println("drittes if");
                else 
                    System.out.println("Kein Fall trifft zu");
    }
}
