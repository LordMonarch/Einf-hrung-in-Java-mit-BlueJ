
/**
 * Controller-Klasse des Projektes
 * 
 * @author      Florian 
 * @version     Kapitel 12
 */
import java.awt.event.*;

public class Controller 
{
    private final Student model; 
    private final ZuschauerImpl view;
    
    public Controller(final Student model, final ZuschauerImpl view)
    {
        this.model = model; 
        this.view = view;
        this.view.setGaukler(model);
        
        // ActionListener 
        this.view.btnJongliere.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    model.jongliere();
                    view.btnJongliere.setEnabled(false);
                }
            }
        );
        
        this.view.btnJungfrau.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    model.zersaegeJungfrau();
                    view.btnJungfrau.setEnabled(false);
                }
            }
        );
        
        this.view.btnKaninchen.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent ev)
                {
                    model.zaubereKaninchen();
                    view.btnKaninchen.setEnabled(false);
                }
            }
        ); 
    }     
}
