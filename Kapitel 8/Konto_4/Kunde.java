/**
 * Die Klasse Kunde modelliert einen Kunden der Bank
 * 
 * @author      Florian
 * @version     Kapitel 8 - Version 4
 */
public class Kunde
{
    private boolean weiblich = false;  
    private String name = new String(); 
    private Konto girokonto = new Konto(); 

    public Kunde(String name, boolean weiblich)
    {
        this.name = name; 
        this.weiblich = weiblich;
    }
 
    public Kunde(boolean weiblich, String name)
    {
        this.name = name; 
        this.weiblich = weiblich;
    } 

    /**
     * Geld erhalten und auf das Konto einzahlen
     * @param betrag Der Betrag, der empfangen wird
     */
    public void erhalteGeld(int betrag)
    {
        if(betrag <= 0)
        {
            System.out.println("Ich kann kein Geld sehen.");
        }
        else
        {
            girokonto.einzahlen(betrag);
        }
    } 

    /**
     * Überweist den angegebenen Betrag auf ein anderes Konto
     * @param empfaenger Der Kunde, der das Geld erhalten soll
     * @param betrag Der zu überweisende Betrag
     */
    public void ueberweisen(Kunde empfaenger, int betrag)
    {
        if(girokonto.abheben(betrag))
        {
            empfaenger.erhalteGeld(betrag);
        }
        else
        {
            System.out.println("Die Überweisung konnte nicht durchgeführt werden.");
        }
    }

    /**
     * Setzt den Namen des Kunden
     * @param name Der Name des Kunden
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Der Kunde stellt sich vor - auf der Konsole wird ein entsprechender Text ausgegeben
     */
    public void vorstellen()
    {
        System.out.println("Guten Tag, ich heiße " + name + ".");
    }
}
