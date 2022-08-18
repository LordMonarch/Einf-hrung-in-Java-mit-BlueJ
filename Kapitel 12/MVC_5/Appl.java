
/**
 * Startet das Programm
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
public class Appl
{
    public static void main(String[] args)    
    {
        Student model = new Student("Albert", "Einstein");
        ZuschauerImpl view = new ZuschauerImpl();
        Controller control = new Controller(model, view);
    }
}
