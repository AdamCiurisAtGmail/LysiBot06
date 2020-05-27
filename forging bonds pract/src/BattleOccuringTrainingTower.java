
public class BattleOccuringTrainingTower {
    public static void BattleOccuring() {
        TenthStratum TS = new TenthStratum();
        StageClearGameOver stageCleAr = new StageClearGameOver();
        ColorComponents breakup = new ColorComponents();
        ColorTolerance checktol = new ColorTolerance();
        //checktol.stageclearToleranceTest;

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

            int tolcheckofV[] = breakup.ColorComponentsMethod(gameOVer.gameoVer());
            checktol.stageclearToleranceTest(tolcheckofV, tolcheckofV.length);
            if (checktol.gameoverToleranceTest(tolcheckofV, tolcheckofV.length) == true) {
                SCorGO += 2;
            }
            maxruns++;
            if (SCorGO == 1 || SCorGO == 2) {
                break;
            }
        }


        int maxruns2 = 0;
        int questspressed = 0;


        //switch depending on stage clear or game over
        switch (SCorGO) {
            case 1:   //stage clear screen is reached call postclear
                PostClear bordercolors = new PostClear();
                PostClear postClear = new PostClear();

                //one tap to proceed past stage clear and clicking badges
                postClear.SC();

                //checking for post clear borders it's on 20 for now until i tighten it up
                bordercolors.BorderColors();
                while (maxruns2 != 10) {

                    int tolcheckofborder[] = breakup.ColorComponentsMethod(bordercolors.BorderColors());
                    checktol.borderToleranceTest(tolcheckofborder, tolcheckofborder.length);

                    if (checktol.gameoverToleranceTest(tolcheckofborder, tolcheckofborder.length) == true) {
                        postClear.questsSC();
                        questspressed++;
                    }

                    if (questspressed == 2) {
                        break;
                    }

                    maxruns2++;
                }
                System.out.println("post stage clear happened");
                break;
                //gameover still has to be implemented

            case 2:
                System.out.println("gameover happened");
            break;

        }

        TS.tenthStratum(0);
    }
}
