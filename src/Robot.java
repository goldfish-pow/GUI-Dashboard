import java.awt.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.event.*;
import java.awt.image.*;

public class Robot extends JPanel{
    private Image wheel_topLeft = new ImageIcon("images/RobotWheel.png").getImage();;
    private Image wheel_topRight = new ImageIcon("images/RobotWheel.png").getImage();;
    private Image wheel_bottomLeft = new ImageIcon("images/RobotWheel.png").getImage();;
    private Image wheel_bottomRight = new ImageIcon("images/RobotWheel.png").getImage();;
    private Image body = new ImageIcon("images/RobotBody.png").getImage();

    private Graphics2D g2D;

    public Robot()
    {
        this.setBounds(640, 10, 150, 150);
        //this.setBackground(new Color(158, 187, 232));
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g2D = (Graphics2D) g;
        
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
        ImageIcon icon = new ImageIcon("images/RobotWheel.png");
        Image icon_img = new ImageIcon("images/RobotWheel.png").getImage();
        BufferedImage blankCanvas = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D gg2d = (Graphics2D)blankCanvas.getGraphics();
        gg2d.rotate(Math.toRadians(-degrees), icon.getIconWidth()/2, icon.getIconHeight()/2);
        gg2d.drawImage(icon_img, 0, 0, o);
        
        if(pos.equals("Top-Left"))
        {
            this.wheel_topLeft = blankCanvas;
        }
        else if(pos.equals("Top-Right"))
        {
            this.wheel_topRight = blankCanvas;
        }
        else if(pos.equals("Bottom-Left"))
        {
            this.wheel_bottomLeft = blankCanvas;
        }
        else if(pos.equals("Bottom-Right"))
        {
            this.wheel_bottomRight = blankCanvas;
        }
    }
}
