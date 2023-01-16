import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame{
    MyFrame()
    {
        this.setTitle("GUI Dashboard");
        this.setSize(1200, 700);
        this.setVisible(true); //make frame visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
    }

    public void addLabel(Label label)
    {
        this.add(label);
    }
}
