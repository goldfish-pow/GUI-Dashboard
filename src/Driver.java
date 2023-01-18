import java.awt.*;

import javax.swing.*;

public class Driver{
    static NumVar mouseposition;
    static Robot rob;
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        
        mouseposition = new NumVar(10, 10, "Mouse X Position");
        frame.add(mouseposition);

        rob = new Robot();
        frame.add(rob);
    }
}
