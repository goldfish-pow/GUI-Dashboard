import java.awt.*;

import javax.swing.*;

import com.github.sarxos.*;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

public class WebCamCapture extends JFrame{
    Webcam web = Webcam.getDefault();
    WebcamPanel webcamPanel = new WebcamPanel(web);

    public WebCamCapture()
    {
        web.setViewSize(WebcamResolution.VGA.getSize());
        webcamPanel.setImageSizeDisplayed(true);
        webcamPanel.setBounds(10, 180, 500, 500);

    }

}
