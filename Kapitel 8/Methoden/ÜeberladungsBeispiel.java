
/**
 * Beschreiben Sie hier die Klasse ÜeberladungsBeispiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ÜeberladungsBeispiel
{
    private double a;
    private double b = 3.1415;
    private double c = addiere(5,b);
    
   public int addiere(int a, int b)
   {
       int c = a + b;
       return c;
    }
    public double addiere(double a, double b)
    {
        double c = a + b;
        return c;
    }
}
