public class Driver{
    
    public static void main(String[] args){
        Constructor con = new Constructor();
        MyThread thr = new MyThread(con);
        Thread myThread = new Thread(thr);
        
        con.frame.add(con.other_var);
        con.frame.add(con.vis_var);
        
        con.frame.add(con.swer_var);

        //con.frame.add(web.webcamPanel);

        //con.frame.add(mouseposition);
  
        con.frame.add(con.rob);
        con.frame.add(con.game_map);

        myThread.start();
    }
}
