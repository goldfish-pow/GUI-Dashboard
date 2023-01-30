public class Constructor {
    public NumVar mouseposition;
    public Robot rob;
    public OtherVariables other_var;
    public VisionVariable vis_var;
    public SwerveVariable swer_var;
    public WebCamCapture web;
    public MyFrame frame;

    public Constructor()
    {
        
        frame = new MyFrame();
        
        other_var = new OtherVariables();

        vis_var = new VisionVariable();

        swer_var = new SwerveVariable();

        //web = new WebCamCapture();

        //mouseposition = new NumVar(10, 10, "Mouse X Position");
  
        rob = new Robot();
    }
}