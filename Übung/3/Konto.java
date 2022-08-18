
/**
 * Die Klasse Konto stellt die wesentlichen Funktionalit�ten 
 * zur Verf�gung, um ein Konto zu verwalten.
 * Der Kontostand und der Name des Kontoinhabers k�nnen gesetzt 
 * und abgefragt werden. 
 * 
 * @author      Florian
 * @version     Kapitel 3
 */
public class Konto
{     
    /**
     * Der aktuelle Kontostand
     */
    public int kontostand = 50;

    /**
     * Der Name des Kontoinhabers
     */
    private String kontoinhaber = "Kunde K�nig"; 
    
    /**
     * Gibt den Kontostand zur�ck
     * @return ganzzahliger Kontostand
     */
    public int getKontostand()
    {
        return kontostand;
    }
    
    /**
     * Setzt den Kontostand
     * @param betrag Der Betrag, den das Konto k�nftig haben soll
     */
    public void setKontostand(int betrag)
    {
        kontostand = betrag;
    }
  
    /**
     * Druckt den Text, der als Parameter mitgegeben wird, auf der Konsole aus
     * @param text der Text, der ausgedruckt werden soll. 
     */
    private void drucke(String text)
    {
        System.out.println(text);
    }
    
    /**
     * Gibt den Kontoinhaber zur�ck und druckt den Namen auf der Konsole
     * @return Name des Kontoinhabers
     */
    public String getKontoinhaber()
    {
        drucke(kontoinhaber);
        return kontoinhaber;
    }
    
    /**
     * Setzt den Namen des Kontoinhabers
     * @param name Name des Kontoinhabers
     */
    public void setKontoinhaber(String name)
    {
        kontoinhaber = name;
    }
}
