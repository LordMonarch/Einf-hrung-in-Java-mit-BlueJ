
/**
 * Beschreiben Sie hier die Klasse Klausur.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Klausur
{
   private int punkte;
   private String thema = new String();
   
   public void setpunkte(int punkte)
   {
       this.punkte = punkte;
    }
    
   public void setthema(String thema)
   {
       this.thema = thema;
    }
    
   public String getThema()
   {
       return(thema);
    }
}
