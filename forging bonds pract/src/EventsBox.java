import java.awt.*;
import java.awt.Robot;

public class EventsBox {

    private Robot robot;
    private Clicks clicks;


     public void one() {
         try {
             robot = new Robot();
         } catch (AWTException e) {
             e.printStackTrace();
         }
         int xrand = (int) (Math.random() * 201);
         int yrand = (int) (Math.random() * 76);

         //now adding up to pick a spot in rectangles area
         int xpick1 = (int) (xrand + 362);
         int ypick1 = (int) (yrand + 212);

         //moving mouse to that location and clicking


         robot.mouseMove(xpick1, ypick1);
         robot.delay(xrand+3000);
         Clicks.leftClick(robot);


    }
    //just adding 29 pixels to y
    public void two() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.delay(3000);
        int xrand = (int) (Math.random() * 201);
        int yrand = (int) (Math.random() * 76);

        //now adding up to pick a spot in rectangles area
        int xpick1 = (int) (xrand + 362);
        int ypick1 = (int) (yrand + 317);

        //moving mouse to that location and clicking

        System.out.println(xpick1 + " " + ypick1);


        robot.mouseMove(xpick1, ypick1);
        robot.delay(xrand+3000);
        Clicks.leftClick(robot);


    }
    public void three() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        int xrand = (int) (Math.random() * 201);
        int yrand = (int) (Math.random() * 76);

        //now adding up to pick a spot in rectangles area
        int xpick1 = (int) (xrand + 362);
        int ypick1 = (int) (yrand + 422);

        //moving mouse to that location and clicking

        System.out.println(xpick1 + " " + ypick1);


        robot.mouseMove(xpick1, ypick1);
        robot.delay(xrand+3000);
        Clicks.leftClick(robot);


    }
    public void four() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        int xrand = (int) (Math.random() * 201);
        int yrand = (int) (Math.random() * 76);

        //now adding up to pick a spot in rectangles area
        int xpick1 = (int) (xrand + 362);
        int ypick1 = (int) (yrand + 527);

        //moving mouse to that location and clicking

        System.out.println(xpick1 + " " + ypick1);


        robot.mouseMove(xpick1, ypick1);
        robot.delay(xrand+3000);
        Clicks.leftClick(robot);


    }

}
