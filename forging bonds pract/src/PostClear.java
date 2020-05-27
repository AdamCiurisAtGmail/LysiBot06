
import java.awt.*;
import java.awt.Robot;
import java.io.File;

/*
SC() will complete the post stage clear stuff
it uses the color bot to determine where to press
GO() will do the same but from the game over screen
 */

public class PostClear {
    private Clicks clicks;
    private Robot robot;

    public void SC() {


        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.delay((int) (2000 * Math.random() + 3000));

        //now performing one tap
        int xrandtwo = (int) (Math.random() * 300);
        int yrandtwo = (int) (Math.random() * 425);
        int xpicktwo = (int) (xrandtwo + 350);
        int ypicktwo = (int) (yrandtwo + 200);

        robot.mouseMove(xpicktwo, ypicktwo);
        Clicks.leftClick(robot);
        robot.delay((int) (2000 * Math.random() + 5000));

        //badges (always needs to happen for training tower)
        int xrandbadges = (int) (Math.random() * 218);
        int yrandbadges = (int) (Math.random() * 30);
        int xpickbadges = (int) (xrandbadges + 403);
        int ypickbadges = (int) (yrandbadges + 436);

        System.out.println(xpickbadges + " " + ypickbadges);
        robot.mouseMove(xpickbadges, ypickbadges);
        Clicks.leftClick(robot);
        robot.delay((int) (2000 * Math.random() + 5000));
    }

        /*
        create a check for border
        need to takepic
        then obtain the color
        break em up
        check tol
        proceed if it finds the border
        move past this part if it doesnt and restart tenthstratum loop
         */

    //this creates an array of the colors of the border
    static Color[] BorderColors() {
        ColorBot takeRGB = new ColorBot();
        ColorBot takepic = new ColorBot();
        File file = takepic.takePic();


        int arrayplace = 0;


        double j = 343;
        double ymax = 315;
        double ymin = 269;
        int size = (int) (ymax-ymin);

        Color colorarray[] = new Color[size+1];

        for (double i = ymin; i <= ymax; i++) {



            //casting i and j to ints x and y
            int x = (int) i;
            int y = (int) j;


            // this is taking rgb then printing the pixel location
            Color c = (takeRGB.rgbINPUT(y, x, file));
            // System.out.println(x + " " + y);
            colorarray[arrayplace] = c;
            arrayplace++;
        }
        return colorarray;

    }
    public void questsSC() {


        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.delay((int) (2000 * Math.random() + 3000));

        //now proceeding through quests or quest rewards
        int xrandtwo = (int) (Math.random() * 120);
        int yrandtwo = (int) (Math.random() * 25);
        int xpicktwo = (int) (xrandtwo + 400);
        int ypicktwo = (int) (yrandtwo + 570);

        robot.mouseMove(xpicktwo, ypicktwo);
        Clicks.leftClick(robot);
        robot.delay((int) (2000 * Math.random() + 5000));


    }




}


