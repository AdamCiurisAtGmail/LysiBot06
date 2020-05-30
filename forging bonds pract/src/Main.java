import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("tt(1) , fb(2) , tempesttrials(3)");
        int choose = (int) scnr.nextInt();
       switch (choose) {
           case 1:{
               TenthStratum TS = new TenthStratum();

               Scanner howmanyruns = new Scanner(System.in);
               int runs = howmanyruns.nextInt();
               BattleOccuringTrainingTower begin = new BattleOccuringTrainingTower();

               TS.tenthStratum(1);
               for (int i = 1; i <= runs; i++) {
                   begin.BattleOccuring();

               }
               break;

           }


           case 2:{
               System.out.println("event box number, runs, advintbeg");

               int whichbox = (int) scnr.nextInt();
               int runs = scnr.nextInt();
               int advintbeg = scnr.nextInt();

               ForgingBonds beginFB = new ForgingBonds();
               BattleOccuringForgingBonds test = new BattleOccuringForgingBonds();
                int q = 1;


               for (int i = 1; i<= runs; i++) {
                   beginFB.Eventsforgingbonds(q,whichbox,advintbeg);
                   test.BattleOccuring();
                   test.FBRewards();

                   //story skip buttons not currently working may be checking too fast
                   test.story1checks();
                   test.story2checks();
                   q = 0;
               }
               break;
           }

           //beginning of tempest trials
           case 3: {
               System.out.print("event box number, runs, stratum");
               int whichbox = scnr.nextInt();
               int runs = scnr.nextInt();
               int stratum = scnr.nextInt();



               TempestTrials beginTempest = new TempestTrials();
               BattleOccuringTempest test = new BattleOccuringTempest();
               PostClearTempestQuests aaugh = new PostClearTempestQuests();

               int q = 0;

               beginTempest.Eventstempesttrials(q,whichbox,stratum);
               for (int i = 1; i < runs; i++){
                    test.BattleOccuring();
                    aaugh.FinalTasks();
                }

           }



       }


    }
}
