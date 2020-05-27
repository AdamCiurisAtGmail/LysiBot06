import java.awt.*;
import java.awt.Robot;
import java.io.IOException;


public class TenthStratum {
    //creating robot and clicks
    private Robot robot;
    private Clicks clicks;

    public void tenthStratum(int q) {

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //picking random x and y value for training tower from battle menu
        //int q determines if this method should run from "battle" menu
        if (q == 1) {
            int xrand = (int) (Math.random() * 39);
            int yrand = (int) (Math.random() * 49);

            //now adding up to pick a spot in rectangles area
            int xpick1 = (int) (xrand + 388);
            int ypick1 = (int) (yrand + 496);

            //moving mouse to that location and clicking

            System.out.println(xpick1 + " " + ypick1);


            robot.mouseMove(xpick1, ypick1);
            robot.delay(xrand);
            Clicks.leftClick(robot);
        }
        //it has clicked training tower
        if (q ==1 || q ==0) {

            robot.delay((int) (2000 * Math.random() + 3000));

            //now clicking tenth stratum
            int xrandtwo = (int) (Math.random() * 235);
            int yrandtwo = (int) (Math.random() * 62);
            int xpicktwo = (int) (xrandtwo + 395);
            int ypicktwo = (int) (yrandtwo + 225);

            System.out.println(xpicktwo + " " + ypicktwo);
            robot.mouseMove(xpicktwo, ypicktwo);
            Clicks.leftClick(robot);
            robot.delay((int) (2000 * Math.random() + 5000));

            //fight!
            int xrandfite = (int) (Math.random() * 226);
            int yrandfite = (int) (Math.random() * 31);
            int xpickfite = (int) (xrandfite + 396);
            int ypickfite = (int) (yrandfite + 496);

            System.out.println(xpickfite + " " + ypickfite);
            robot.mouseMove(xpickfite, ypickfite);
            Clicks.leftClick(robot);
            robot.delay((int) (2000 * Math.random() + 5000));

            //now clicking autobattle
            int xrandthree = (int) (Math.random() * 36);
            int yrandthree = (int) (Math.random() * 35);
            int xpickthree = (int) (xrandthree + 601);
            int ypickthree = (int) (yrandthree + 675);

            System.out.println(xpickthree + " " + ypickthree);
            robot.mouseMove(xpickthree, ypickthree);
            Clicks.leftClick(robot);
            robot.delay((int) (2000 * Math.random() + 3000));

            //play automatically?
            int xrandfour = (int) (Math.random() * 220);
            int yrandfour = (int) (Math.random() * 31);
            int xpickfour = (int) (xrandfour + 396);
            int ypickfour = (int) (yrandfour + 352);

            System.out.println(xpickfour + " " + ypickfour);
            robot.mouseMove(xpickfour, ypickfour);
            Clicks.leftClick(robot);
            robot.delay((int) (2000 * Math.random() + 3000));
        }

    }
}
