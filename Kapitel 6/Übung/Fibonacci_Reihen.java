
/**
 * Beschreiben Sie hier die Klasse Fibonacci_Reihen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fibonacci_Reihen
{
    public static void main(String[] args)
    {
        long a = 0, b = 0, c;
        
        for (int i = 0; i <= 50; i++)
        {
            if (i == 0 || i == 1) // initialisieren
            {
                System.out.println(i);
                a = 0;
                b = 1;
                continue;
            }
            
            c = a + b;
            System.out.println(c);
            
            a = b;
            b = c;
        }
    }
}
