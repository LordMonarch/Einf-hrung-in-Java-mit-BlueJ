import javax.swing.*;

public class MyFrame extends JFrame
{   
    MyFrame()
    {        
        // Die Gr??e des Fensters in Pixel
        setSize(500, 500);
 
        // Programm beenden, wenn Fenster geschlossen wird
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        this.setVisible(true);
        this.addWindowListener(new MyWindowListener());
    } 
}
