import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeListener;

public class MyThread extends Thread
{
    NumVar variable;

    public MyThread(NumVar var)
    {
        variable = var;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            variable.change(MyFrame.mousePosX);
            variable.repaint();
        }
    }
}
