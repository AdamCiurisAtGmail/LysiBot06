
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class StageClearGameOver {
    //this will check whether the stage clear or game over screen is up





    static Color[] stagecleAr() {
        ColorBot takeRGB = new ColorBot();
        ColorBot takepic = new ColorBot();
        File file = takepic.takePic();

//stage cleAr A bar check
        int arrayplace = 0;

        double slope = 31.0 / 13.0;
        double j = 390;
        double xmax = 639;
        double xmin = 626;
        int size = (int) (xmax-xmin);

        Color colorarray[] = new Color[size+1];

        for (double i = xmin; i <= xmax; i++) {

            j = (slope * i) - 1134;

            //casting i and j to ints x and y
            int x = (int) i;
            int y = (int) j;


            // this is taking rgb then printing the pixel location
            Color c = (takeRGB.rgbINPUT(x, y, file));
            // System.out.println(x + " " + y);
            colorarray[arrayplace] = c;
            arrayplace++;
        }
        return colorarray;

    }

    //stAge clear A bar check

    static Color[] stAgeclear() {

        ColorBot takepic = new ColorBot();
        File file = takepic.takePic();

        int arrayplace = 0;
        ColorBot takeRGB = new ColorBot();
        double slope = 31.0 / 13.0;
        double j = 358;
        double xmax = 418;
        double xmin = 405;
        int size = (int) (xmax-xmin);

        Color colorarray[] = new Color[size+1];

        for (double i = xmin; i <= xmax; i++) {

            j = (slope * i) - 604;

            //casting i and j to ints x and y
            int x = (int) i;
            int y = (int) j;

            takeRGB.rgbINPUT(x, y, file);
            // System.out.println(x + " " + y);
            Color c = (takeRGB.rgbINPUT(x, y, file));
            colorarray[arrayplace] = c;
            arrayplace++;

        }//gonna have to store this in an array
        //will need to return a boolean true/false
        //much still to be done
        return colorarray;
    }


    //game over check
    static Color[] gameoVer() {

        ColorBot takepic = new ColorBot();
        File file = takepic.takePic();

        int arrayplace = 0;
        ColorBot takeRGB = new ColorBot();
        double slope = 30.0 / 12.0;
        double j = 352;
        double xmax = 575;
        double xmin = 563;
        int size = (int) (xmax-xmin);

        Color colorarray[] = new Color[size+1];
        for (double i = 563; i <= 575; i++) {

            j = (slope * i) - 1058;

            //casting i and j to ints x and y
            int x = (int) i;
            int y = (int) j;

            takeRGB.rgbINPUT(x, y, file);
            // System.out.println(x + " " + y);
            Color c = (takeRGB.rgbINPUT(x, y, file));
            colorarray[arrayplace] = c;
            arrayplace++;

        }return colorarray;
    }
    //copy pasted below maybe wrong
    static Color[] gaMeover() {

        ColorBot takepic = new ColorBot();
        File file = takepic.takePic();

        int arrayplace = 0;
        ColorBot takeRGB = new ColorBot();
        double slope = 18.0 / 9.0;
        double j = 352;
        double xmax = 440;
        double xmin = 431;
        int size = (int) (xmax-xmin);

        Color colorarray[] = new Color[size+1];

        for (double i = xmin; i <= xmax; i++) {

            j = (slope * i) - 510;

            //casting i and j to ints x and y
            int x = (int) i;
            int y = (int) j;

            takeRGB.rgbINPUT(x, y, file);
            //System.out.println(x + " " + y);
            Color c = (takeRGB.rgbINPUT(x, y, file));
            colorarray[arrayplace] = c;
            arrayplace++;

        }return colorarray;

    }


}



