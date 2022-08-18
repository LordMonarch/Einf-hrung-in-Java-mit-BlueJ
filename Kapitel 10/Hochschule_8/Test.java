/**
 * Die Testklasse enthält Testfälle für das Projekt 
 * 
 * @author      Florian 
 * @version     Kapitel 9
 */ 

public class Test
{
    public static void main(String[] args)
    {
        // unzulässige Aufrufe
        // Mensch einMensch = new Mensch("Egon Roth");
        // Mitarbeiter einMitarbeiter = new Mitarbeiter();

        // zulässige Aufrufe
        Student einStudent = new Student("Susi Schlau", "08-15"); 
        Professor einProf = new Professor("Udo Richter", "Jura");        
        Angestellter einAngestellter = new Angestellter("Hans Kirch", true);
        Mensch hanna = new Angestellter("Hanna Kirch", false);    
        
        int menge = 13;
        int preis = einStudent.kaufeMarken(menge);
        System.out.println("Ein Student kauft " + menge + " Märkchen");
        System.out.println("\tGesamtpreis: " + preis + "\n");
        
        preis = einProf.kaufeMarken(menge);
        System.out.println("Ein Professor kauft " + menge + " Märkchen");
        System.out.println("\tGesamtpreis: " + preis + "\n");
        
        preis = einAngestellter.kaufeMarken(menge);
        System.out.println("Ein Angestellter kauft " + menge + " Märkchen");
        System.out.println("\tGesamtpreis: " + preis + "\n");
        
        preis = hanna.kaufeMarken(menge);
        System.out.println("Hanna kauft " + menge + " Märkchen");
        System.out.println("\tGesamtpreis: " + preis + "\n");
    }   
}