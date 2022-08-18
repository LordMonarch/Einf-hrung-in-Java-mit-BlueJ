
/**
 * Das Interface GauklerModel definiert einen Typ, der als Gaukler für Zuschauer verwendet wird
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */

public interface GauklerModel
{
    public String getAktion();
    public void notifyZuschauer();
    public void addZuschauer(Zuschauer zuschauer);
}
