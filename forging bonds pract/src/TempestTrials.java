import java.awt.*;

/*
this is the first step in launching tempest trials
 */
public class TempestTrials {
    private Robot robot;
    private Clicks clicks;

    public void Eventstempesttrials(int q, int whichbox, int stratum) {
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
            }


            System.out.println("amistarting?");
            robot.delay(10000);
//now clicking sel stage

            int xrandtwo = (int) (Math.random() * 258);
            int yrandtwo = (int) (Math.random() * 42);
            int xpicktwo = (int) (xrandtwo + 381);
            int ypicktwo = (int) (yrandtwo + 562);

            System.out.println(xpicktwo + " " + ypicktwo);
            robot.mouseMove(xpicktwo, ypicktwo);
            robot.delay((int) (1000));
            Clicks.leftClick(robot);

            robot.delay((int) (2000 * Math.random() + 5000));

            robot.delay(10000);
//now tapping bar on right


            int yrandbar = (int) (Math.random() * 5);
            //maybe should math rand below
            int xpickbar = (int) (695);
            int ypickbar = (int) (yrandbar + 230);

            System.out.println(xpickbar + " " + ypickbar);
            robot.mouseMove(xpickbar, ypickbar);
            robot.delay(1000);
            Clicks.leftClick(robot);

            robot.delay((int) (2000 * Math.random() + 5000));
        }


        //it has clicked tt
        if (q == 1 || q == 0) {


            //below switch case needs to be reworked for tempest
            switch (stratum) {
                case 1:
                    //level 40
                    System.out.println("40");
                    int xrand1 = (int) (Math.random() * 239);
                    int yrand1 = (int) (Math.random() * 50);
                    int xpick1 = (int) (xrand1 + 396);
                    int ypick1 = (int) (yrand1 + 270);


                    robot.mouseMove(xpick1, ypick1);
                    Clicks.leftClick(robot);
                    robot.delay((int) (2000 * Math.random() + 5000));
                    break;
                case 2:
                    //lv 35
                    System.out.println("35");
                    int xrand2 = (int) (Math.random() * 249);
                    int yrand2 = (int) (Math.random() * 60);
                    int xpick2 = (int) (xrand2 + 387);
                    int ypick2 = (int) (yrand2 + 389);


                    robot.mouseMove(xpick2, ypick2);
                    Clicks.leftClick(robot);
                    robot.delay((int) (2000 * Math.random() + 5000));
                    break;

                case 3:
                    //lv 30
                    System.out.println("30");
                    int xrand3 = (int) (Math.random() * 246);
                    int yrand3 = (int) (Math.random() * 49);
                    int xpick3 = (int) (xrand3 + 381);
                    int ypick3 = (int) (yrand3 + 513);


                    robot.mouseMove(xpick3, ypick3);
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

        /*
        the below if statement completes the remaining
        4 battles for a 5 battle tempest trial
         */
        if (q == 40 || q == 35 || q == 30) {
            for (int i = 1; i<= 4; i++){
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


            StageClearGameOver stageCleAr = new StageClearGameOver();
            ColorComponents breakup = new ColorComponents();
            ColorTolerance checktol = new ColorTolerance();
            //checktol.stageclearToleranceTest;
            TempestTrials beginTempest = new TempestTrials();


            int SCorGO = 0;
            int maxruns = 0;
            //first tol check
            //it checks a2
            while (maxruns != 100) {
                int tolcheckofA[] = breakup.ColorComponentsMethod(stageCleAr.stagecleAr());
                checktol.stageclearToleranceTest(tolcheckofA, tolcheckofA.length);
                if (checktol.stageclearToleranceTest(tolcheckofA, tolcheckofA.length) == true) {
                    SCorGO++;
                    System.out.println(SCorGO);
                }

                //checks v
                StageClearGameOver gameOVer = new StageClearGameOver();
                gameOVer.gameoVer();
/*
            int tolcheckofV[] = breakup.ColorComponentsMethod(gameOVer.gameoVer());
            checktol.stageclearToleranceTest(tolcheckofV, tolcheckofV.length);
            if (checktol.gameoverToleranceTest(tolcheckofV, tolcheckofV.length) == true) {
                SCorGO += 2;
            }

 */
                maxruns++;
                if (SCorGO == 1 || SCorGO == 2) {
                    break;
                }



            }
            //need to run rest of things


            int maxruns2 = 0;
            int questspressed = 0;


            //switch depending on stage clear or game over
            switch (SCorGO) {
                case 1:   //stage clear screen is reached call postclear
                    PostClearForgingBonds bordercolorsFB = new PostClearForgingBonds();
                    PostClearForgingBonds pcfb = new PostClearForgingBonds();
                    PostClear bordercolors1 = new PostClear();

                    //one tap to proceed past stage clear and clicking points
                    pcfb.SC(99);

                    //checks if quest borders are there and should be working fine imported from TT
                    bordercolors1.BorderColors();
                    while (maxruns2 != 10) {

                        int tolcheckofborder[] = breakup.ColorComponentsMethod(bordercolors1.BorderColors());
                        checktol.borderToleranceTest(tolcheckofborder, tolcheckofborder.length);

                        if (checktol.borderToleranceTest(tolcheckofborder, tolcheckofborder.length) == true) {
                            pcfb.questsSC();
                            questspressed++;
                        }

                        if (questspressed == 1) {
                            break;
                        }

                        maxruns2++;
                    }
                    break;
                //prints at case 2 as well when case 1 happens, known bug
                case 2:
                    System.out.println("gameover happened");
                    break;

            }
            }

        }
    }
}
