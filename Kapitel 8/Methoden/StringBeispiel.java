
/**
 * Beschreiben Sie hier die Klasse StringBeispiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class StringBeispiel
{
   public static void main(String[] args)
   {
       String text = "Hallo, schöne Java-Welt!";
       
       aendern(text);
       
       System.out.println(text);
    }
    
    private static void aendern(String parameter)
    {
        parameter = parameter.toUpperCase();
    }
}
