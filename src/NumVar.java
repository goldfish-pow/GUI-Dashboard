import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeListener;

public class NumVar extends JLabel
{
    private String variable_name;
    private int variable_value;

    public NumVar(int x, int y, int wid, int hei, String name)
    {
        this.setBounds(x, y, wid, hei);
        this.setText(name + ": 0");
        
        Thread thr = new Thread();
    }

}
