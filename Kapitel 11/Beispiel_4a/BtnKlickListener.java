
/**
 * Die Klasse btnKlickListener stellt einen EventListener für den Button btnKlick zur Verfügung
 * 
 * @author      Florian 
 * @version     Kapitel 11
 */
import java.awt.event.*;
import javax.swing.JFrame;

public class BtnKlickListener implements ActionListener
{       
    private MyFrame fenster; 
    
    //Konstruktor -> (this)
    BtnKlickListener(MyFrame fenster)
    {
        this.fenster = fenster;
    }

    public void actionPerformed(ActionEvent e) 
    {    
        System.out.println("Gedrückt");
        fenster.setLabelText("Button wurde aktiviert");
        //lblText.setText("Button wurde gedrückt");
    }
}
