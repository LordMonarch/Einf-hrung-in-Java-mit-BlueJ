
/**
 * Beschreiben Sie hier die Klasse IntParameter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class IntParameter
{
    public static int addiere(int[] zahlen)
    {
    int ergebnis = 0;
    for (int temp : zahlen)
    {
        ergebnis += temp;
    }
    return ergebnis;

}
 public static int addiereKurz(int ... zahlen)
    {
    int ergebnis = 0;
    for (int temp : zahlen)
    {
        ergebnis += temp;
    }
    return ergebnis;

}
}
