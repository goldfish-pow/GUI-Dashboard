import edu.wpi.first.networktables.DoubleSubscriber;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTablesJNI;
import edu.wpi.first.util.CombinedRuntimeLoader;

import java.io.IOException;

import edu.wpi.first.cscore.CameraServerJNI;
import edu.wpi.first.math.WPIMathJNI;
import edu.wpi.first.util.WPIUtilJNI;

public class Driver{
    
    public static void main(String[] args){
        Constructor con = new Constructor();
        MyThread thr = new MyThread(con);
        Thread myThread = new Thread(thr);
        
        con.frame.add(con.other_var);
        con.frame.add(con.vis_var);
        
        con.frame.add(con.swer_var);


        //con.frame.add(mouseposition);
  
        con.frame.add(con.rob);
        con.frame.add(con.game_map);
        
        con.frame.addKeyListener(con.game_map);

        NetworkTablesJNI.Helper.setExtractOnStaticLoad(false);
        WPIUtilJNI.Helper.setExtractOnStaticLoad(false);
        WPIMathJNI.Helper.setExtractOnStaticLoad(false);
        CameraServerJNI.Helper.setExtractOnStaticLoad(false);

        //CombinedRuntimeLoader.loadLibraries(Program.class, "wpiutiljni", "wpimathjni", "ntcorejni",
                //"cscorejnicvstatic");

        myThread.start();
    }
}
