import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeListener;

public class NumVar extends JLabel
{
    private String variable_name;

    public NumVar(int x, int y, String name)
    {
        variable_name = name;
        this.setText(name + ": 0");
        this.setBounds(x, y, 500, 15);
        
        MyThread thr = new MyThread();
        Thread myThread = new Thread(thr);
        myThread.start();
    }

    public void change(int num)
    {
        this.setText(variable_name + ": " + num);
    }

}
