import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeListener;

import java.lang.Thread;



public class MyThread extends Driver implements Runnable
{
    @Override
    public void run()
    {
        while(true)
        {
            mouseposition.change(MyFrame.mousePosX);
            mouseposition.repaint();
        }
    }
}
