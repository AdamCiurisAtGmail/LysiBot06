
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class ColorBot {

    //takePic creates a png of the main display in the autofeh folder and names it screen_capture.png
    public static File takePic() {
        try {
            Robot robot = new Robot();
//wtf is getdefaulttoolkit
            Rectangle wholescreen = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage buffimg = robot.createScreenCapture(wholescreen);
            File file = new File("screen_capture.png");
            boolean status = ImageIO.write(buffimg, "png", file);
            // System.out.println("Screen Captured ? " + status + "File Path:- " + file.getAbsolutePath());

        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
        //is below lines necessary? returns file
        File file = new File("screen_capture.png");
        return file;

    }


    /*runs the above method and
    takes the rgb at the int x and y passed to it
    then it returns the color
     unless it messes up then it returns null
     x and y come from stagecleargame
     */
    public static Color rgbINPUT(int x, int y, File screenCap) {
        BufferedImage img = null;


        Color c = null;
        try {
            img = ImageIO.read(screenCap);
            c = new Color(img.getRGB(x, y));
            //  System.out.println(c);
            return c;

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            return c;
        }
    }
}



