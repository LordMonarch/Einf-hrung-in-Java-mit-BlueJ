
/**
 * Beschreiben Sie hier die Klasse Student.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.Scanner;
public class Student
{
   private String name = new String();
   private int matrikelnummer;
   Klausur liste = new Klausur();
   
   public void setname(String name)
   {
       this.name = name;
   }
   
   public void setmatrikelnummer(int matrikelnummer)
   {
       this.matrikelnummer = matrikelnummer;
   }
   
}
