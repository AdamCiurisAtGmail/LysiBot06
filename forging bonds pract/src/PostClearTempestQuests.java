import java.awt.*;

public class PostClearTempestQuests {
    private Robot robot;
    private Clicks clicks;
    /*
    this class will click through "you win"
     the quests should they appear
    and the rewards
     */
    public void FinalTasks() {
        ColorTolerance checktol = new ColorTolerance();
        ColorComponents breakup = new ColorComponents();
        PostClearForgingBonds bordercolorsFB = new PostClearForgingBonds();
        PostClearForgingBonds pcfb = new PostClearForgingBonds();
        PostClear bordercolors1 = new PostClear();
        int maxruns2 = 0;
        int questspressed = 0;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //clicking you win
        int xrandtwo = (int) (Math.random() * 220);
        int yrandtwo = (int) (Math.random() * 27);
        int xpicktwo = (int) (xrandtwo + 400);
        int ypicktwo = (int) (yrandtwo + 620);

        System.out.println(xpicktwo + " " + ypicktwo);
        robot.mouseMove(xpicktwo, ypicktwo);
        robot.delay((int) (2000));
        Clicks.leftClick(robot);

        robot.delay((int) (2000 * Math.random() + 5000));

        robot.delay(10000);


        //checks if quest borders are there and should be working fine imported from TT
        bordercolors1.BorderColors(); //<-- is this line necessary?
        while (maxruns2 != 10) {

            int tolcheckofborder[] = breakup.ColorComponentsMethod(bordercolors1.BorderColors());
            checktol.borderToleranceTest(tolcheckofborder, tolcheckofborder.length);

            if (checktol.borderToleranceTest(tolcheckofborder, tolcheckofborder.length) == true) {
                pcfb.questsSC();
                questspressed++;
            }

            if (questspressed == 2) {
                break;
            }

            maxruns2++;
        }

//below clicks through rewards



            int rewardspressesd = 0;
            int maxruns3 = 0;
            //checking for daily first clear reward and possibly other rewards




            //runs ten times and ends if it clicks twice
        //this may be broken or not collecting at right location
            bordercolorsFB.BorderColorsRewards();
            while (maxruns3 != 15) {

                int tolcheckofborder[] = breakup.ColorComponentsMethod(bordercolorsFB.BorderColorsRewards());
                checktol.borderToleranceTest(tolcheckofborder, tolcheckofborder.length);

                if (checktol.borderToleranceTest(tolcheckofborder, tolcheckofborder.length) == true) {
                    pcfb.BorderColorsRewards();
                    pcfb.rewards();
                    rewardspressesd++;
                }

                if (rewardspressesd == 4) {
                    break;
                }

                maxruns3++;
                System.out.println("we are in rewards");

        }
    }
}
