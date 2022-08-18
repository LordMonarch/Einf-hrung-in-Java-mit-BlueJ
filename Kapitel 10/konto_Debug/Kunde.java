
/**
 * Die Klasse Kunde enthält die Daten eines Kunden und Methoden, 
 * um auf diese Daten zuzugreifen
 * 
 * @author      Florian
 * @version     Kapitel 10
 */
public class Kunde
{ 
    /**
     * Gibt Auskunft über die Anzahl der Kunden der Bank
     */
    private static int anzahlKunden = 0;
    
    /**
     * Der Vorname des Kunden - wird mit "Vorname" initialisiert
     */
    private String vorname = "Vorname";
    
    /**
     * Der Nachname des Kunden - wird mit "Nachname" initialisiert
     */
    private String nachname = "Nachname";
    
    /**
     * enthält eine Referenz auf das Girokonto des Kunden
     */
    private Konto giroKonto; 
    
    /**
     * argumentloser Konstruktor - legt ein Girokonto für den Kunden an und erhöht den Kundenzähler
     */
    public Kunde()
    {
        giroKontoAnlegen();
        anzahlKunden++;
    } 
    
    /**
     * Konstruktor, der Vor- und Nachnamen entgegennimmt. Ruft den argumentlosen Konstruktor auf und 
     * weist dann Vor- und Nachname zu. 
     */
    public Kunde(String vorname, String nachname)
    {
        this();
        this.vorname = vorname; 
        this.nachname = nachname;         
    }
        
    /**
     *  Diese Methode legt ein Girokonto an
     */
    private void giroKontoAnlegen()
    { 
        giroKonto = new Konto();
    }
    
    /**
     * Der Kunde kann Geld einzahlen
     * @param double der einzuzahlende Betrag
     */
    public void einzahlen(double betrag)
    {
        if(betrag >= 0)
        {
            giroKonto.einzahlen(betrag); 
            System.out.println(this.vorname + " hat " + betrag + " eingezahlt.");
        }
    }
    
    /**
     * Der Kunde hebt Geld ab. Wenn die Abbuchung erfolgreich war, 
     * wird eine Erfolgsmeldung auf der Konsole ausgegeben. 
     * @param double der Betrag, der abgehoben werden soll. 
     */
    public void abheben(double betrag)
    {
        if(giroKonto.abheben(betrag))
            System.out.println(this.vorname + " hat " + betrag + " abgehoben.");
    }
    
    /**
     * Der Kunde überweist mit dieser Methode Geld an einen anderen Kunden
     * @param Kunde Referenz auf des Objekt des Empfängers
     * @param double der zu überweisende Betrag
     * @return true, wenn erfolgreich und false, wenn ein Fehler aufgetreten ist
     */
    public boolean ueberweisen(Kunde empfaenger, double betrag)
    {
        boolean erfolgreich = false; 
        
        if(giroKonto.abheben(betrag) == true)
        {
            empfaenger.einzahlen(betrag);
            erfolgreich = true;
        }
        else
        {
            System.out.println("Es ist nicht genug Geld auf dem Konto, um diesen Vorgang auszuführen.");
        }
        return erfolgreich;        
    } 
    
    /**
     * Der Kunde stellt sich vor und teilt mit, wie viel Geld er auf dem Konto hat.  
     */
    public void vorstellen()
    {
        System.out.println("Guten Tag, ich heiße " + vorname + " " + nachname);
        System.out.println("Ich habe " + giroKonto.getKontostand() + " Euro auf dem Konto");
    }  
    
    /**
     * Statische Methode, die die Anzahl der Kunden zurückgibt
     * @return Anzahl der Kunden 
     */
    public static int getKundenzahl()
    {
        return anzahlKunden;
    }
    
    /**
     * Der Vorname des Kunden wird gesetzt - ein vorhandener Vorname wird überschrieben
     * @param vorname Vorname des Kunden 
     */
    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }
    
    /**
     * Der Nachname des Kunden wird gesetzt - ein vorhandener Nachname wird überschrieben
     * @param nachname Nachname des Kunden
     */
    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    } 
    
    public String toString()
    {
        return vorname + " " + nachname;
    }
}
