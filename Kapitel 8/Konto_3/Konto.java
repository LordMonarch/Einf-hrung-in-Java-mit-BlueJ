
/**
 * Die Klasse Konto stellt die wesentlichen Funktionalitäten 
 * zur Verfügung, um ein Konto zu verwalten. 
 * 
 * @author      Florian
 * @version     Kapitel 8 - Version 3
 */
public class Konto
{     
    /**
     * Der aktuelle Kontostand
     */
    private int kontostand = 10;
    
    /**
     * Gibt eine Erfolgsmeldung auf der Konsole aus 
     */
    public Konto()
    {
        System.out.println("Das Konto wurde eröffnet");
    }
    
    /**
     * Initialisiert den Kontostand mit einem parametrisierten Wert und gibt eine Erfolgsmeldung auf der Konsole aus 
     */
	public Konto(int betrag)
	{ 
	    this();
		kontostand = betrag;
	} 
	
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
        fremdesKonto.einzahlen(betrag);
        kontostand -= betrag;
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
}
