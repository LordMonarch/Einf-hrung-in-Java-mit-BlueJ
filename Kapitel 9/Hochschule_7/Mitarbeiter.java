/**
 * Die Klasse Mitarbeiter verwaltet die Daten eines Mitarbeiters
 * egal, ob Professor oder Angestellter. 
 * 
 * @author      Florian 
 * @version     Kapitel 9
 */
public class Mitarbeiter extends Mensch
{
    /**
     * Die Personalnummer des Mitarbeiters
     */
    private int personalnummer = 0;
    
    /**
     * Der Konstruktor nimmt den Namen und die Personalnummer entgegen. Den Namen 
     * reicht er an die Superklasse weiter, die Personalnummer wird im Feld 
     * personalnummer gespeichert. 
     * @param name Der Name des Mitarbeiters
     * @param personalnummer Die Personalnummer des Mitarbeiters
     */
    protected Mitarbeiter(String name, int personalnummer)
    {
        super(name);
        this.personalnummer = personalnummer;
    }
    
    /**
     * Der Konstruktor nimmt den Namen entgegen. Die Personalnummer wird als Zufallszahl generiert. 
     * Name und Personalnummer werden an den Konstruktor Mitarbeiter(String name, int personalnummer)
     * weitergereicht
     * @param name Der Name des Mitarbeiters
     */
    protected Mitarbeiter(String name)
    { 
        this(name, (int)(Math.random() * 1000) );
    }
    
    /**
     * Lässt den Benutzer eine Personalnummer eingeben
     * @param int Die Personalnummer
     */
    public void setPersonalnummer(int personalnummer)
    {
        this.personalnummer = personalnummer;
    }   
    
    /**
     * Gibt die Personalnummer zurück
     * @return Die Personalnummer
     */
    public int getPersonalnummer()
    {
        return personalnummer;
    }
    
    /**
     * Gibt einen String zurück, der einen Vorstellungstext enthält
     * @return Zeichenkette mit einer kurzen Vorstellung
     */
    public String vorstellen()
    {
        return super.vorstellen() + "Meine Personalnummer ist " + personalnummer + ". ";
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " - Personalnummer: " + personalnummer;
    }
}
