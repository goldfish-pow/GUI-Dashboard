import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeListener;

public class NumVar extends JLabel
{
    private String variable_name;
    private int variable_value;

    public NumVar(int x, int y, String name)
    {
        variable_name = name;
        this.setText(name + ": 0");
        this.setBounds(x, y, 500, 15);
        
        MyThread thr = new MyThread(this);
        thr.start();
    }

    public void change(int num)
    {
        this.setText(variable_name + ": " + num);
    }

}
