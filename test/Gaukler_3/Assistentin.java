
/**
 * Modelliert eine Assistentin des Gauklers
 * 
 * @author      Florian 
 * @version     Kapitel 10 
 */
public class Assistentin
{
    /**
     * Der Name der Assistentin
     */
    private String name; 
    /**
     * Referenz auf den Gaukler
     */
    private Gaukler gaukler; 
    
    /**
     * Initialisiert den Namen der Assistentin
     */
    public Assistentin(String name, Gaukler gaukler)
    {
        this.name = name; 
        this.gaukler = gaukler; 
    }
    
    /**
     * Gibt einen Text auf der Konsole aus, mit dem Werbung für die Veranstaltung gemacht wird
     */
    public void macheWerbung()
    {
        System.out.println("Kommt zu unserer Gaukeley \"" + gaukler.getMotto() + "\"!\n");
    }
    
    /**
     * Konsolenausgabe mit dem Namen der Assistentin
     */
    public void vorstellen()
    {
        System.out.println("Ich bin die Assistentin " + name);
    }
}
