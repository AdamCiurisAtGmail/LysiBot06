
import java.awt.*;
import java.awt.Robot;
import java.io.File;

/*
SC() will complete the post stage clear stuff
it uses the color bot to determine where to press
GO() will do the same but from the game over screen
 */

public class PostClearForgingBonds {
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

        //points (always needs to happen for FB)
        int xrandpoints = (int) (Math.random() * 120);
        int yrandpoints = (int) (Math.random() * 29);
        int xpickpoints = (int) (xrandpoints + 400);
        int ypickpoints = (int) (yrandpoints + 463);


        robot.mouseMove(xpickpoints, ypickpoints);
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
    //THIS MAKES ARRAY FOR BADGES AND PLACES WITH SAME BORDER AS BADGES
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

    static Color[] BorderColorsRewards() {
        ColorBot takeRGB = new ColorBot();
        ColorBot takepic = new ColorBot();
        File file = takepic.takePic();


        int arrayplace = 0;


        double j = 353;
        double ymax = 382;
        double ymin = 372;
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

    static Color[] SkipButton() {
        ColorBot takeRGB = new ColorBot();
        ColorBot takepic = new ColorBot();
        File file = takepic.takePic();


        int arrayplace = 0;


        double j = 45;
        double xmax = 597;
        double xmin = 587;
        int size = (int) (xmax-xmin);

        Color colorarray[] = new Color[size+1];

        for (double i = xmin; i <= xmax; i++) {



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
    static Color[] SkipButton2() {
        ColorBot takeRGB = new ColorBot();
        ColorBot takepic = new ColorBot();
        File file = takepic.takePic();


        int arrayplace = 0;


        double j = 180;
        double xmax = 597;
        double xmin = 587;
        int size = (int) (xmax-xmin);

        Color colorarray[] = new Color[size+1];

        for (double i = xmin; i <= xmax; i++) {



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
    /*
    this is a robot class and I probably shouldn't have it here
    going to create robots here and possibly make different method late
     */
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
        int xpicktwo = xrandtwo + 400;
        int ypicktwo = yrandtwo + 570;

        robot.mouseMove(xpicktwo, ypicktwo);
        Clicks.leftClick(robot);
        robot.delay((int) (2000 * Math.random() + 5000));


    }

    public void rewards() {

        System.out.println("we pressing rewarsd?");

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.delay((int) (2000 * Math.random() + 3000));

        //now proceeding through quests or quest rewards
        int xrandtwo = (int) (Math.random() * 212);
        int yrandtwo = (int) (Math.random() * 25);
        int xpicktwo = xrandtwo + 401;
        int ypicktwo = yrandtwo + 452;

        robot.mouseMove(xpicktwo, ypicktwo);
        Clicks.leftClick(robot);
        robot.delay((int) (2000 * Math.random() + 5000));


    }
    public void pressskipbutton1and3() {

System.out.println("we skippin?");
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.delay((int) (2000 * Math.random() + 3000));

        //now proceeding through quests or quest rewards
        int xrandtwo = (int) (Math.random() * 93);
        int yrandtwo = (int) (Math.random() * 13);
        int xpicktwo = xrandtwo + 598;
        int ypicktwo = yrandtwo + 43;

        robot.mouseMove(xpicktwo, ypicktwo);
        Clicks.leftClick(robot);
        robot.delay((int) (2000 * Math.random() + 5000));


    }
    public void pressskipbutton2() {


        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.delay((int) (2000 * Math.random() + 3000));

        //now proceeding through quests or quest rewards
        int xrandtwo = (int) (Math.random() * 93);
        int yrandtwo = (int) (Math.random() * 13);
        int xpicktwo = xrandtwo + 598;
        int ypicktwo = yrandtwo + 197;

        robot.mouseMove(xpicktwo, ypicktwo);
        Clicks.leftClick(robot);
        robot.delay((int) (2000 * Math.random() + 5000));


    }




}


