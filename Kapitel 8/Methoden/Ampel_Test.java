
/**
 * Beschreiben Sie hier die Klasse Ampel_Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ampel_Test
{
    public static void main(String[] args)
    {
        int ampel;
        ampel = Ampelfarbe.ROT;
        switch(ampel)
        {
            case 1 : System.out.println("Halten");
            case 2 : System.out.println("Gang einlegen");
            default : System.out.println("Fahren"); break;
        }
    }
}
