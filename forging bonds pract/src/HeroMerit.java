import java.awt.*;
import java.awt.Robot;
import java.io.IOException;


public class HeroMerit {
    //creating robot and clicks
    private Robot robot;
    private Clicks clicks;

    public void HM(int q, int level, int difficulty) {

        HeroMerit Chooser = new HeroMerit();

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //picking random x and y value for training tower from battle menu
        //int q determines if this method should run from "battle" menu
        if (q == 1) {
            int xrand = (int) (Math.random() * 54);
            int yrand = (int) (Math.random() * 53);

            //now adding up to pick a spot in rectangles area
            int xpick1 = (int) (xrand + 582);
            int ypick1 = (int) (yrand + 160);

            //moving mouse to that location and clicking

            System.out.println(xpick1 + " " + ypick1);


            robot.mouseMove(xpick1, ypick1);
            robot.delay(xrand);
            Clicks.leftClick(robot);
            robot.delay(3000);
            switch(level){
                case 1:{
                    Chooser.one();
                    break;

                }
                case 2:{
                    Chooser.two();
                    break;}
            case 3:{
            Chooser.three();
            break;
            }
            }
            }

        //it has clicked into hm
        if (q ==1 || q ==0) {
            switch(difficulty){
                case 1:{
                    Chooser.abyssal();
                    break;

                }
                case 2:{
                    Chooser.lunatic();
                    break;}
                case 3:{
                    Chooser.hard();

                }

            robot.delay((int) (2000 * Math.random() + 3000));



            //fight!
            int xrandfite = (int) (Math.random() * 217);
            int yrandfite = (int) (Math.random() * 27);
            int xpickfite = (int) (xrandfite + 402);
            int ypickfite = (int) (yrandfite + 524);

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
    public void one(){
        //needs to click level
        int xrandtwo = (int) (Math.random() * 291);
        int yrandtwo = (int) (Math.random() * 62);
        int xpicktwo = (int) (xrandtwo + 366);
        int ypicktwo = (int) (yrandtwo + 223);

        System.out.println(xpicktwo + " " + ypicktwo);
        robot.mouseMove(xpicktwo, ypicktwo);
        Clicks.leftClick(robot);
        robot.delay((int) (2000 * Math.random() + 5000));
    }
    public void two(){
        int xrandtwo = (int) (Math.random() * 295);
        int yrandtwo = (int) (Math.random() * 72);
        int xpicktwo = (int) (xrandtwo + 365);
        int ypicktwo = (int) (yrandtwo + 335);

        System.out.println(xpicktwo + " " + ypicktwo);
        robot.mouseMove(xpicktwo, ypicktwo);
        Clicks.leftClick(robot);
        robot.delay((int) (2000 * Math.random() + 5000));

    }
    public void three(){
        int xrandtwo = (int) (Math.random() * 288);
        int yrandtwo = (int) (Math.random() * 71);
        int xpicktwo = (int) (xrandtwo + 368);
        int ypicktwo = (int) (yrandtwo + 565);

        System.out.println(xpicktwo + " " + ypicktwo);
        robot.mouseMove(xpicktwo, ypicktwo);
        Clicks.leftClick(robot);
        robot.delay((int) (2000 * Math.random() + 5000));


    }
        public void abyssal() {
            int xrandtwo = (int) (Math.random() * 238);
            int yrandtwo = (int) (Math.random() * 52);
            int xpicktwo = (int) (xrandtwo + 396);
            int ypicktwo = (int) (yrandtwo + 227);

            System.out.println(xpicktwo + " " + ypicktwo);
            robot.mouseMove(xpicktwo, ypicktwo);
            Clicks.leftClick(robot);
            robot.delay((int) (2000 * Math.random() + 5000));


        }
        public void lunatic(){
            int xrandtwo = (int) (Math.random() * 234);
            int yrandtwo = (int) (Math.random() * 54);
            int xpicktwo = (int) (xrandtwo + 396);
            int ypicktwo = (int) (yrandtwo + 349);

            System.out.println(xpicktwo + " " + ypicktwo);
            robot.mouseMove(xpicktwo, ypicktwo);
            Clicks.leftClick(robot);
            robot.delay((int) (2000 * Math.random() + 5000));


        }
        public void hard(){
            int xrandtwo = (int) (Math.random() * 250);
            int yrandtwo = (int) (Math.random() * 54);
            int xpicktwo = (int) (xrandtwo + 389);
            int ypicktwo = (int) (yrandtwo + 470);

            System.out.println(xpicktwo + " " + ypicktwo);
            robot.mouseMove(xpicktwo, ypicktwo);
            Clicks.leftClick(robot);
            robot.delay((int) (2000 * Math.random() + 5000));


        }


}
