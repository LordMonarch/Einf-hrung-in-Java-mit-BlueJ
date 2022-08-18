/**
 * Die Klasse Konto stellt die wesentlichen Funktionalitäten 
 * zur Verfügung, um ein Konto zu verwalten.  
 * Bitte entnehmen Sie die Dokumentation dieser Klasse dem BlueJ-Buch
 * 
 * @author      Florian
 * @version     Kapitel 10
 */

public class Konto
{ 
    private double kontostand;  
        
    public Konto()
    {
        kontostand = 10.00;        
    }
    
    public void einzahlen(double betrag)
    {
        kontostand += betrag;
    } 
    
    public boolean abheben(double betrag)
    {
        boolean erfolgreich = false;
        if(kontostand - betrag >= 0)
        {
            kontostand -= betrag;
            erfolgreich = true;
        } 
        return erfolgreich;
    }
    
    public double getKontostand()
    {
        return kontostand;
    }
}
