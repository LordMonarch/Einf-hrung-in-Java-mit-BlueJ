
/**
 * Die Klasse BankTest verwaltet Kunden- und Konto-Objekte
 * 
 * @author      Florian 
 * @version     Kapitel 8
 */
import java.util.*;

public class BankTest
{
    static
    {
        System.out.println("Der Banktest wird durchgeführt");
    }

    public static void main(String[] args)
    {
        Kunde alice = new Kunde("Alice", "Müller");
        Kunde bob = new Kunde("Bob", "Baumeister");
        System.out.println("Die Bank hat " + Kunde.getKundenzahl() + " Kunden");
        alice.vorstellen();
        bob.vorstellen();
        
        alice.einzahlen(100);
        alice.abheben(20.00);
        alice.ueberweisen(bob, 10); 
         
        /*
        System.out.println("Die Ausführung des Programms wird jetzt gestoppt");  
        try
        {
            Thread.sleep(10000);
        }
        catch(Exception ex)
        {
            // nichts machen
        } 
        */
        
        alice.ueberweisen(bob, 40.77);
        bob.ueberweisen(alice, 30.33);     
    }
}
