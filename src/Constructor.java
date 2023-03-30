import edu.wpi.first.networktables.DoubleSubscriber;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTablesJNI;
import edu.wpi.first.util.CombinedRuntimeLoader;

import java.io.IOException;

import edu.wpi.first.cscore.CameraServerJNI;
import edu.wpi.first.math.WPIMathJNI;
import edu.wpi.first.util.WPIUtilJNI;


public class Constructor {
    public NumVar mouseposition;
    public VisualRobot rob;
    public OtherVariables other_var;
    public VisionVariable vis_var;
    public SwerveVariable swer_var;
    public MyFrame frame;
    public GameMap game_map;
    public NetworkTableInstance inst = NetworkTableInstance.getDefault();
    public NetworkTable table = inst.getTable("titanium_dashboard");
    public double value = table.getEntry("m_speed").getDouble(0.0);

    public Constructor()
    {
        
        frame = new MyFrame();
        
        other_var = new OtherVariables();

        vis_var = new VisionVariable();

        swer_var = new SwerveVariable();

        //web = new WebCamCapture();

        //mouseposition = new NumVar(10, 10, "Mouse X Position");
  
        rob = new VisualRobot();

        game_map = new GameMap();

        
        inst.startClientTeam(1160); // replace 1234 with your team number
        inst.startDSClient(); // required for Driver Station connection

        
    }
}
