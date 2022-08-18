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
        Mensch einMensch = new Mensch("Egon Roth");
        Student einStudent = new Student("Viktor Hase"); 
        Professor einProf = new Professor("Meister Lampe");
        Angestellter hans = new Angestellter("Hans Kirch", 42);
        Angestellter heinz = new Angestellter("Heinz Kirch"); 
        
        einStudent.setMatrikel("08-15");
        einProf.setFachbereich("Informatik");  
 
        hans.setPersonalrat(true); 
        heinz.setPersonalrat(false);

        System.out.println(einMensch.vorstellen());
        System.out.println(einProf.vorstellen());      
        System.out.println(einStudent.vorstellen());
        System.out.println(hans.vorstellen());
        System.out.println(heinz.vorstellen());
        
        System.out.println("*** Die Arbeitsgruppe ***");
        Mensch[] arbeitsgruppe = new Mensch[]{einMensch, einStudent, heinz};
        for(Mensch temp : arbeitsgruppe)
            System.out.println(temp.vorstellen());
    }   
}