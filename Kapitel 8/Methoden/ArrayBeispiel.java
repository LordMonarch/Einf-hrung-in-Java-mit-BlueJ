
/**
 * Beschreiben Sie hier die Klasse ArrayBeispiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ArrayBeispiel
{
    public static void main(String[] args)
    {
        int[] zahlen = new int[]{1, 2, 3, 4, 5};
        
        aendern(zahlen);
        
        for ( int i : zahlen)
        {
            System.out.println(i);
        }
    }
    
    private static void aendern(int[] parameter)
    {
        for (int j = parameter.length - 1; j >= 0; j--)
        {
            parameter[j] = 2 * (j + 1);
        }
    }
}
