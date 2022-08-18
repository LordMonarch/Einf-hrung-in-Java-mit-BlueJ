
/**
 * Beschreiben Sie hier die Klasse Übungen_mit_Fließkommazahlen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Übungen_mit_Fließkommazahlen
{
   public static void main(String[] args){
       //1
       double a = 10.0, b = 3.5, c;
       c = a * 1.5 - ++b;
       System.out.println("Ergebnis 1: " + c);
       //2
       a = 10.0;
       b = 3.5;
       int d;
       d = (int)(a * 1.5 - b++);
       System.out.println("Ergebnis 2: " + ++d);
       //3
       a = 15.0;
       b = 2.5;
       c = 0.0;
       c = a / 1.5 + b;
       System.out.println("Ergebnis 3: " + -++c);
       //4
       a = 15.0;
       b = 2.5;
       c = 0.0;
       c = a % 1.5 - b;
       System.out.println("Ergebnis 4: " + c);
       //5
       d = 1;
       b = 3.0;
       System.out.println("Ergebnis 5: " + (int)1 / 3);
       
    }
}
