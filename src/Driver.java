import java.awt.*;

import javax.swing.*;

public class Driver{
    static NumVar mouseposition;
    static Robot rob;
    static OtherVariables other_var;
    static VisionVariable vis_var;
    static SwerveVariable swer_var;
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        
        other_var = new OtherVariables();
        frame.add(other_var);

        vis_var = new VisionVariable();
        frame.add(vis_var);

        swer_var = new SwerveVariable();
        frame.add(swer_var);

        //mouseposition = new NumVar(10, 10, "Mouse X Position");
        //frame.add(mouseposition);

        rob = new Robot();
        frame.add(rob);

        MyThread thr = new MyThread();
        Thread myThread = new Thread(thr);
        myThread.start();
    }
}
