import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.awt.image.*;

public class Robot extends JPanel implements ActionListener{
    Image body_img;
    ImageIcon body_img_icon;
    JLabel body;
    Timer timer;
    int ang = 30;
    int x = 85;
    Graphics2D g2D;

    public Robot()
    {
        this.setBounds(100, 50, 500, 500);
        this.setBackground(Color.white);

        body_img = new ImageIcon("images/RobotBody.png").getImage();
        timer = new Timer(100, this);
        body_img_icon = new ImageIcon("images/RobotBody.png");
        timer.start();
        //body = new JLabel(body_img);
        //body.setBounds(500, 30, 150, 150);
        //body.setVerticalAlignment(JLabel.CENTER);
        //body.setHorizontalAlignment(JLabel.CENTER);
        //this.add(body);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g2D = (Graphics2D) g;
        
        g2D.rotate(Math.toRadians(ang), body_img_icon.getIconWidth() / 2, body_img_icon.getIconHeight() / 2);
        g2D.drawImage(body_img, 500, 100, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        ang += 10;
        repaint();
    }

    /*
    public void rotateImage(double degrees, ImageObserver o)
    {
        ImageIcon icon = new ImageIcon(body_img);
        BufferedImage blankCanvas = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D gg2d = (Graphics2D)blankCanvas.getGraphics();
        gg2d.rotate(Math.toRadians(degrees), icon.getIconWidth()/2, icon.getIconHeight()/2);
        gg2d.drawImage(this.body_img, 0, 0, o);
        this.body_img = blankCanvas;
    }
    */
}
