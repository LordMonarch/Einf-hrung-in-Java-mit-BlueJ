
/**
 * Die Klasse Konto stellt die wesentlichen Funktionalitäten 
 * zur Verfügung, um ein Konto zu verwalten. 
 * 
 * @author      Florian
 * @version     Kapitel 8
 */
public class Konto
{     
    /**
     * Der aktuelle Kontostand
     */
    private int kontostand = 50;

    /**
     * Der Name des Kontoinhabers
     */
    private String kontoinhaber = "Kunde König";
    
    /**
     * Zahlt einen Geldbetrag auf das Konto ein
     * @param betrag Der Betrag, um den der Kontostand erhöht werden soll
     */
    public void einzahlen(int betrag)
    {
        if(betrag >= 0)
        {
            kontostand += betrag; 
        }
    }
    
    /**
     * Überweist den angegebenen Betrag auf ein anderes Konto
     * @param fremdesKonto Das Konto, auf das das Geld überweisen wird
     * @param betrag Der zu überweisende Betrag
     */
    public void ueberweisen(Konto fremdesKonto, int betrag)
	{
        if(betrag >= 0)
        {
            fremdesKonto.einzahlen(betrag);
            kontostand -= betrag;
        }
	}
    
    /**
     * Gibt den Kontostand zurück
     * @return ganzzahliger Kontostand
     */
    public int getKontostand()
    {
        return kontostand;
    }
    
    /**
     * Setzt den Kontostand
     * @param betrag Der Betrag, den das Konto künftig haben soll
     */
    public void setKontostand(int betrag)
    {
        kontostand = betrag;
    }
    
    /**
     * Gibt den Kontoinhaber zurück 
     * @return Name des Kontoinhabers
     */
    public String getKontoinhaber()
    { 
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
