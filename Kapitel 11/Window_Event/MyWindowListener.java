
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
 
public class MyWindowListener implements WindowListener
{
    @Override
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Event windowActivated");
    }

    @Override
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Event windowClosed");
    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Event windowClosing"); 
    }

    @Override
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Event windowDeactivated");
    }

    @Override
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Event windowDeiconified");
    }

    @Override
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Event windowIconified");
    }

    @Override
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Event windowOpened");
    }
}
