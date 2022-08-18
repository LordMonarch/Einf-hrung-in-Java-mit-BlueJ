
/**
 * Beschreiben Sie hier die Klasse for_Schleifen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class for_Schleifen
{
  public static void main(String[] args){
    int[] zahlfeld = new int[10];
    for (int i = 0; i < 10; i++)
    {
        zahlfeld[i] = i + 1;
    }
    for (int j = 0; j < zahlfeld.length && j< (zahlfeld.length / 2); j++)
    {
        System.out.println("Ausgabe: " + zahlfeld[j]);
    }
}
}
