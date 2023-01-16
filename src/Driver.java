import java.awt.*;

import javax.swing.*;

public class Driver{
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        
        NumVar mouseposition = new NumVar(10, 10, "Mouse X Position");
        frame.add(mouseposition);
    }
}
