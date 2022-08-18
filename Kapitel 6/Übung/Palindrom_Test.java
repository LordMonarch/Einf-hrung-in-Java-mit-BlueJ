
/**
 * Beschreiben Sie hier die Klasse Palindrom_Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Palindrom_Test
{
  public static void main(String[] args)
  {
      String text = new String();
      String vergleich = new String();
     
      text = "Trug Tim eine so helle Hose nie mit Gurt+Die Liebe Fleht: Helfe bei Leid+Leonie bewegt Gewebe in Oel";
      text = text.replaceAll(" ", "");
      char[] dest = new char[text.length()];
        
      text.getChars(0, text.length(), dest, 0);
      
      for (char j : dest)
      {
      vergleich = j + vergleich ;
      }      
      
      System.out.println(text);
      System.out.println(vergleich);  
      
  }
}
