
public class Fakultät
{
   public static void main (String[] args)
   {
       System.out.println("nicht Rekursiv: " + berechneFakultät_nr(5));
       System.out.println("Rekursiv: " + berechneFakultät_r(5));
    }
    
    private static long berechneFakultät_nr(int zahl)
    {
        long ergebnis = 1;
        for (int i = zahl; i >= 1; i--)
            ergebnis *= i;
        
            return ergebnis;
    }
    
    private static long berechneFakultät_r(int zahl)
    {
        if (zahl <= 0)
            return 1;
        else
            return zahl * berechneFakultät_r(zahl - 1);
    }
}
