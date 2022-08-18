
/**
 * Die Klasse Konto stellt die wesentlichen Funktionalit�ten 
 * zur Verf�gung, um ein Konto zu verwalten.
 * Der Kontostand und der Name des Kontoinhabers k�nnen gesetzt 
 * und abgefragt werden. 
 * 
 * @author      Florian
 * @version     Kapitel 8 - Version 2
 */
public class Konto
{     
    /**
     * Der aktuelle Kontostand
     */
    private int kontostand = 50;

    /**
     * Zahlt einen Geldbetrag auf das Konto ein
     * @param betrag Der Betrag, um den der Kontostand erh�ht werden soll
     */
    public void einzahlen(int betrag)
    {
        if(betrag >= 0)
        {
            kontostand += betrag; 
        }
    }

    /**
     * �berweist den angegebenen Betrag auf ein anderes Konto
     * @param fremdesKonto Das Konto, auf das das Geld �berweisen wird
     * @param betrag Der zu �berweisende Betrag
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
}
