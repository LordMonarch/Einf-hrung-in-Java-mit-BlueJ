
/**
 * Beschreiben Sie hier die Klasse Erste_Übung_zu_if_else.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Erste_Übung_zu_if_else
{
    static public void main(String[] args){
        int j = 1;
        ++j;
        if (++j == 4)
            System.out.println("Erstes if");
        else
            if (j++ == 4)
                System.out.println("Zweites if");
            else
                if (j == 4 || 1 == 3 + 4)
                    System.out.println("Drittes if");
                else
                    System.out.println("Kein Fall trifft zu");
                
            
    }
}