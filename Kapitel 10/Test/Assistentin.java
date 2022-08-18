
/**
 * Beschreiben Sie hier die Klasse Assistentin.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Assistentin
{
    private String name;
    private Gaukler gaukler;
    
    public Assistentin(String name, Gaukler gaukler)
    {
        this.name = name;
        this.gaukler = gaukler;
    }
    
    public void macheWerbung()
    {
        System.out.println("Kommt zu unserer Gaukeley \"" + gaukler.getMOttO() + "\"!\n");
    }
    
    public void vorstellen()
    {
        System.out.println("Ich bin die Assistentin " + name);
    }
}
