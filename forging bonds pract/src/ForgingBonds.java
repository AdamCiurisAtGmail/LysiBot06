import java.awt.*;


public class ForgingBonds {
    private Robot robot;
    private Clicks clicks;

    public void Eventsforgingbonds(int q, int whichbox, int advintbeg) {
        EventsBox choose = new EventsBox();



        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
      /*
      selecting area to click to start FB
       */
        if (q == 1) {

            switch (whichbox) {
                case 1:
                   choose.one();
                   break;
                case 2:
                    choose.two();
                    break;

                    case 3:
                   choose.three();
               break;
                   case 4:
                    choose.four();
                break;
                //check vm version for here
            }


        }
        //it has clicked FB
        if (q ==1) {
        System.out.println("amisel?");
        robot.delay(10000);
//now clicking sel stage
            int xrandtwo = (int) (Math.random() * 265);
            int yrandtwo = (int) (Math.random() * 38);
            int xpicktwo = (int) (xrandtwo + 377);
            int ypicktwo = (int) (yrandtwo + 632);

            System.out.println(xpicktwo + " " + ypicktwo);
            robot.mouseMove(xpicktwo, ypicktwo);
            robot.delay((int) (1000));
            Clicks.leftClick(robot);

            robot.delay((int) (2000 * Math.random() + 5000));


            switch (advintbeg) {
                case 1:
                    //now clicking adv
                    System.out.println("1");
                    int xrand1 = (int) (Math.random() * 240);
                    int yrand1 = (int) (Math.random() * 51);
                    int xpick1 = (int) (xrand1 + 391);
                    int ypick1 = (int) (yrand1 + 351);


                    robot.mouseMove(xpick1, ypick1);
                    Clicks.leftClick(robot);
                    robot.delay((int) (2000 * Math.random() + 5000));
                    break;
                case 2:
                    //now clicking adv
                    System.out.println("2");
                    int xrand2 = (int) (Math.random() * 240);
                    int yrand2 = (int) (Math.random() * 51);
                    int xpick2 = (int) (xrand2 + 391);
                    int ypick2 = (int) (yrand2 + 464);


                    robot.mouseMove(xpick2, ypick2);
                    Clicks.leftClick(robot);
                    robot.delay((int) (2000 * Math.random() + 5000));
                    break;

                case 3:
                    //now clicking beg lol noob
                    System.out.println("3");
                    int xrand3 = (int) (Math.random() * 240);
                    int yrand3 = (int) (Math.random() * 51);
                    int xpick3 = (int) (xrand3 + 391);
                    int ypick3 = (int) (yrand3 + 576);


                    robot.mouseMove(xpicktwo, ypicktwo);
                    Clicks.leftClick(robot);
                    robot.delay((int) (2000 * Math.random() + 5000));
                    break;


            }
            robot.delay((int) (2000 * Math.random() + 6000));



            //fight!
            int xrandfite = (int) (Math.random() * 219);
            int yrandfite = (int) (Math.random() * 29);
            int xpickfite = (int) (xrandfite + 402);
            int ypickfite = (int) (yrandfite + 570);


            robot.mouseMove(xpickfite, ypickfite);
            Clicks.leftClick(robot);
            robot.delay((int) (2000 * Math.random() + 10000));

            //now clicking autobattle
            int xrandthree = (int) (Math.random() * 36);
            int yrandthree = (int) (Math.random() * 35);
            int xpickthree = (int) (xrandthree + 601);
            int ypickthree = (int) (yrandthree + 675);


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
