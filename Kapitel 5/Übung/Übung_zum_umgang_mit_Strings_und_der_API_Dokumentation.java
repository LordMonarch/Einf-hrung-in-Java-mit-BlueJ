
/**
 * Beschreiben Sie hier die Klasse Übung_zum_umgang_mit_Strings_und_der_API_Dokumentation.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Übung_zum_umgang_mit_Strings_und_der_API_Dokumentation
{
    public static void main(String[] args){
    String text = "Thirty days hath September\nApril, June, and November.\nAll the rest have Thirty-One,\n- well, all the rest but one.\nFebruary only hast twenty-eight,\nand that\'s just fine,\nexcept for every fourth year,\nwhen february has twenty-nine.";
    String groß, klein;
    
    groß = text.toUpperCase();
    klein = text.toLowerCase();
    
    System.out.println("Groß: " + groß);
    System.out.println("Klein: " + klein);
    
    if (groß.equals(klein))
        System.out.println("Groß ist gleich Klein");
    else
        System.out.println("Groß ist ungleich Klein");
    
    if (groß.equalsIgnoreCase(klein))
        System.out.println("Groß ist gleich Klein - Schreibung ignoriert");
    else
        System.out.println("Groß ist ungleich Klein - Schreibung ignoriert");
        
    if (text.isEmpty())
        System.out.println("Der String ist Leer");
     else
     System.out.println("Der String hat eine Länge von: " + text.length());
        
    
    }
}
