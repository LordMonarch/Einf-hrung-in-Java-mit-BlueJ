/**
 * Erstellt das Hauptmenü für die View
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import javax.swing.*;

public class MainMenu extends JMenuBar
{
    JMenu menue = new JMenu("Datenpflege");
    public JMenuItem mnPluto = new JMenuItem("Pluto löschen");
    
    public MainMenu()
    {
        this.add(menue);
        menue.add(mnPluto);
    }
}
