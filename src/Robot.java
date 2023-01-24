import java.awt.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.event.*;
import java.awt.image.*;

public class Robot extends JPanel implements MouseInputListener{
    private Image wheel_topLeft_ori = new ImageIcon("images/RobotWheel.png").getImage();
    private Image wheel_topLeft = null;
    private Image wheel_topRight_ori = new ImageIcon("images/RobotWheel.png").getImage();
    private Image wheel_topRight = null;
    private Image wheel_bottomLeft_ori = new ImageIcon("images/RobotWheel.png").getImage();
    private Image wheel_bottomLeft = null;
    private Image wheel_bottomRight_ori = new ImageIcon("images/RobotWheel.png").getImage();
    private Image wheel_bottomRight = null;
    private Image body = new ImageIcon("images/RobotBody.png").getImage();
    private Timer timer;
    private int ang = 0;
    private Graphics2D g2D;
    private int mousePosX = 0;
    private int mousePosY = 0;

    public Robot()
    {
        this.setBounds(650, 50, 150, 150);
        //this.setBackground(null);
        //timer = new Timer(100, this);
        //body_img_icon = new ImageIcon(body_img);
        //timer.start();
        //body = new JLabel(body_img_icon);
        //body.setBounds(250, 60, 150, 150);
        //body.setVerticalAlignment(JLabel.CENTER);
        //body.setHorizontalAlignment(JLabel.CENTER);
        //this.add(body);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g2D = (Graphics2D) g;
        
        //g2D.rotate(Math.toRadians(ang), body_img_icon.getIconWidth() / 2, body_img_icon.getIconHeight() / 2);
        g2D.drawImage(body, 0, 0, null);
        g2D.drawImage(wheel_topLeft, 0, 5, null);
        g2D.drawImage(wheel_topRight, 104, 5, null);
        g2D.drawImage(wheel_bottomLeft, 0, 100, null);
        g2D.drawImage(wheel_bottomRight, 104, 100, null);
    }

        public void change_rotation(int new_ang, String pos) {
            this.rotateImage(new_ang, this, pos);
            repaint();
        }

    public void rotateImage(double degrees, ImageObserver o, String pos)
    {
        ImageIcon icon = null;
        switch(pos)
        {
            case "Top-Left":
                icon = new ImageIcon(wheel_topLeft_ori);
            case "Top-Right":
                icon = new ImageIcon(wheel_topRight_ori); 
            case "Bottom-Left":
                icon = new ImageIcon(wheel_bottomLeft_ori); 
            case "Bottom-Right":
                icon = new ImageIcon(wheel_bottomRight_ori); 
        }
        BufferedImage blankCanvas = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D gg2d = (Graphics2D)blankCanvas.getGraphics();
        gg2d.rotate(Math.toRadians(-degrees), icon.getIconWidth()/2, icon.getIconHeight()/2);
        gg2d.drawImage(this.wheel_topLeft_ori, 0, 0, o);
        
        switch(pos)
        {
            case "Top-Left":
                this.wheel_topLeft = blankCanvas;
            case "Top-Right":
                this.wheel_topRight = blankCanvas;
            case "Bottom-Left":
                this.wheel_bottomLeft = blankCanvas;
            case "Bottom-Right":
                this.wheel_bottomRight = blankCanvas;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        mousePosX = e.getX();
        mousePosY = e.getY();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    
}
