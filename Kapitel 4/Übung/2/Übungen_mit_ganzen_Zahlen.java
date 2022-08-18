
/**
 * Beschreiben Sie hier die Klasse Übungen_mit_ganzen_Zahlen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Übungen_mit_ganzen_Zahlen
{
   public static void main(String[] args){
       //1
       int a = 5, b = 3;
       System.out.println("Ergebnis 1: " + -a * b++);
       //2
       a = 5; 
       b = 3;
       System.out.println("Ergebnis 2: " + --a * b++);
       //3
       long c = 5, d = 3;
       System.out.println("Ergebnis 3: " + --c * -d++);
       //4
       a = 2;
       b = a++;
       System.out.println("Ergebnis 4: " + --a * b++);
       //5
       a = 4;
       b = 0;
       b = ++a * 2;
       b += a++;    // auch b = b + a++
       System.out.println("Ergebnis 5: " + --a * b++);
    }
}
