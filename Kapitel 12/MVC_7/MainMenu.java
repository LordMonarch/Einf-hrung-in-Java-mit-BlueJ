/**
 * Erstellt das Hauptmen� f�r die View
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.*;

public class MainMenu extends JMenuBar
{
    JMenu menue = new JMenu("Datenpflege");
    public JMenuItem mnPluto = new JMenuItem("Pluto l�schen");
    
    public MainMenu()
    {
        this.add(menue);
        menue.add(mnPluto);
    }
}
