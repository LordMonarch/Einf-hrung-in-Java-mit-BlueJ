
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test
{
    public static void main(String[] args){
    Mensch einmensch = new Mensch();
    Student student = new Student();
    Professor prof = new Professor();
    
    einmensch.setName("Egon Roth");
    System.out.println("Ich hei�e "+ einmensch.getName() );
    
    student.setName("Viktor Hase");
    student.setMatrikel("4711x");
    System.out.println("Ich Hei�e " + student.getName() + ". Meine Matrikelnummer ist " + student.getMatrikel() );
    
    prof.setName("Meister Lampe");
    prof.setFachbereich("Informatik");
    System.out.println("Guten Tag, ich hei�e " + prof.getName() + ". Ich bin Professor f�r " + prof.getFachbereich() );
    
}
}
