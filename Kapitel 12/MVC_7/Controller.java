/**
 * Stellt den Controller des Projektes
 * 
 * @author      Florian
 * @version     Kapitel 12
 */ 
import javax.swing.event.*;
import java.awt.event.*;

public class Controller implements ActionListener
{
    private final GUI view;
    private Planetenverwaltung model;

    public Controller(GUI view, Planetenverwaltung model)
    {
        this.view = view;
        this.model = model;
        view.mainMenu.mnPluto.addActionListener(this);
        view.lstPlaneten.setModel(model);
    }    
        
    @Override
    public void actionPerformed(ActionEvent e)
    {
        model.loeschePluto();
        view.mainMenu.mnPluto.setEnabled(false);
    } 
}
