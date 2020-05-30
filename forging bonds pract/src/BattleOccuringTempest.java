public class BattleOccuringTempest{

/*
this method begins at the battle screen and proceeds through the next battles
while checking for quest pop ups in between
 */
    //battleoccuring needs to call NEED TO PASS THE AMOUNT OF BATTLES HERE

    public static void BattleOccuring() {

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

                //one tap to proceed past stage clear and clicking points FIX FIX FI X FIX FIX
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
        //the below  recursively calls it's own method however
        //many times it needs to





            beginTempest.Eventstempesttrials(40,1,1);


    }




    }



















