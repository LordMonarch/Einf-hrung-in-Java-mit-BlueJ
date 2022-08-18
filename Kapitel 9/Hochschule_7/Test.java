/**
 * Die Testklasse enthält Testfälle für das Projekt 
 * 
 * @author      Florian 
 * @version     Kapitel 9
 */

import java.lang.reflect.Field;

public class Test
{
    public static void main(String[] args)
    {
        Mensch einMensch = new Mensch("Egon Roth");
        Student einStudent = new Student("Susanne Schlau", "08-15"); 
        Professor einProf = new Professor("Meister Lampe", "Informatik");
        Angestellter hans = new Angestellter("Hans Kirch", true);
        Angestellter hanna = new Angestellter("Hanna Kirch", false);  

        // Spielereien mit der Methode getClass()
        Class clazz = hans.getClass();
        System.out.println(clazz.getSimpleName());
        // Die Superklasse ausgeben
        Class superClazz = clazz.getSuperclass();
        System.out.println(superClazz);
        // Informationen über die Felder der Klasse
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Felder: " + fields.length + ": ");
        for(Field field : fields)
        {
            System.out.println(field);
        }

        // Test der überschriebenen Methode toString
        System.out.println(einMensch);
        System.out.println(einStudent);
        System.out.println(einProf);
        System.out.println(hans);
        System.out.println(hanna);
        
        // Test der überschriebenen Methode equals
        Student susi = new Student("Susi Schlau", "08-15");
        System.out.println("Sollte scheitern: \"Susi\" ist nicht \"Susanna\": " + susi.equals(einStudent));
        Student susanne = new Student("Susanne Schlau", "08-15");
        System.out.println("Sollte nicht scheitern: " + susanne.equals(einStudent));        
    }   
}