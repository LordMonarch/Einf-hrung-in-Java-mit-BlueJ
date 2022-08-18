
/**
 * Beschreiben Sie hier die Klasse ArraysTest.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.Scanner;
import static java.lang.Math.random;
import static java.lang.Math.PI;
import static java.util.Arrays.*;
public class ArraysTest
{
 
    public static void main(String[] args)
    {
        System.out.println("Wie viele Zahlen sollen erzeugt werden?");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int[] zahlen = new int[j];
        
        //int[] zahlen = new int[10];
        for (int i = 0; i < 10; i++)
        {
            zahlen[i] = (int)(random()*(1000 / PI));
        }
        System.out.println("*** unsortiert ***");
        for(int zahl : zahlen)
        {
           System.out.println(zahl); 
        }
        sort(zahlen);
        System.out.println("*** sortiert ***");
        for(int zahl: zahlen)
        {
            System.out.println(zahl);
        }
                
    }
    
}
