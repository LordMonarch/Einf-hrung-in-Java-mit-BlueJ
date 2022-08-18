
/**
 * Beschreiben Sie hier die Klasse returnBeispiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class returnBeispiel
{
    public int getSumme()
    {
      int a = 2, b = 5;
      int c = a + b;
      if (a + b > c)
      {
         return a + b; //erstes Return
      }
      //return;  //Zweites return
      return c; //drittes return
      //System.out.println(c);
    }
}
