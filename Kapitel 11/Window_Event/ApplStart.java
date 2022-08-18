import javax.swing.*;

public class ApplStart
{ 
    private JFrame fenster = new MyFrame();

    public ApplStart()
    {
        fenster.setVisible(true);
    }

    public static void main(String[] args)
    {
        new ApplStart();
    }
}