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
            //mouseposition.change_num(MyFrame.mousePosX);
            //mouseposition.repaint();
            other_var.title.setLocation(130, 5);
            other_var.variable1.setLocation(10, 30);
            other_var.variable2.setLocation(10, 70);
            other_var.variable3.setLocation(10, 110);

            vis_var.title.setLocation(220, 5);
            vis_var.variable1.setLocation(10, 30);
            vis_var.variable2.setLocation(10, 70);

            swer_var.title.setLocation(35, 5);
            swer_var.variable1.setLocation(10, 30);
            swer_var.variable2.setLocation(10, 70);
            swer_var.variable3.setLocation(10, 110);
            
            other_var.variable1.change_num(MyFrame.mousePosX);
            rob.change_rotation(MyFrame.mousePosX, "Top-Left");
            rob.change_rotation(-MyFrame.mousePosX, "Top-Right");
        }
    }
}
