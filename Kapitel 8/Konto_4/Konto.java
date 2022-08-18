
/**
 * Die Klasse Konto stellt die wesentlichen Funktionalitäten 
 * zur Verfügung, um ein Konto zu verwalten.<br>
 * Der Kontostand kann verändert und abgefragt werden. 
 * 
 * @author      Florian
 * @version     Kapitel 8 - Version 4
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
        if(betrag > 0)
        {
            kontostand += betrag; 
        }
        else
        {
            System.out.println("Ein negativer Betrag kann nicht eingezahlt werden");
        }
    }
    
    /**
     * Hebt Geld vom Konto ab
     * @param betrag Der Betrag, der abgehoben werden soll
     * @return true, wenn der Vorgang erfolgreich war
     */
    public boolean abheben(int betrag)
    {
        boolean erfolgreich = false;
        if(kontostand - betrag >= 0)
        {
            kontostand -= betrag;
            erfolgreich = true;
        } 
        else 
        {
            System.out.println("Es ist nicht genügend auf dem Konto, um diesen Vorgang auszuführen.");
        }
        return erfolgreich;
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
     * Setzt den Kontostand auf den Betrag, der als Parameter mitgegeben wird
     * @param betrag Der gewünschte Kontostand  
     */
    @Deprecated  
    public void setKontostand(int betrag)
    {
        kontostand = betrag;
    }
}
