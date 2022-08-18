/**
 * Abstrakte Klasse AbstractAction - beschreiben Sie hier die Klasse
 * 
 * @author (Ihr Name)
 * @version (eine Version-Nummer oder ein Datum)
 */
public abstract class AbstractAction
{
    protected final int DAUER = 10;
    
   // public AbstractAction(int DAUER)
    //{
     //   this.DAUER = DAUER;
    //}
    
    public String getDauer(int Dauer)
    {
        String str_Dauer = new String();
        str_Dauer = "Ich musste " + Dauer + "Monate für dieses Kunststück üben.";
        return str_Dauer;
    }
    
    public abstract String getAction();
}
