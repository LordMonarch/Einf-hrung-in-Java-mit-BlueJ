
/**
 * Das Interface Zuschauer definiert einen Typ, der als Beobachter beim Gaukler angemeldet werden kann. 
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */

public interface Zuschauer
{
    public void update();
    public void setGaukler(GauklerModel gaukler);
}
