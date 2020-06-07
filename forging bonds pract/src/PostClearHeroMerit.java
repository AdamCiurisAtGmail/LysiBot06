import java.awt.*;
import java.io.File;

public class PostClearHeroMerit {
    private static Robot robot;

    //this gathers the colors at the specified locations
    static Color[] Clear() {
        ColorBot takeRGB = new ColorBot();
        ColorBot takepic = new ColorBot();
        File file = takepic.takePic();


        int arrayplace = 0;


        double j = 559;
        double ymax = 345;
        double ymin = 355;
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
    /*
    this checks if the above array passes the tolerance test
     */
    static void PostClearHM() {


           int maxruns2 = 0;
        PostClearHeroMerit createArray = new PostClearHeroMerit();
        ColorTolerance checktol = new ColorTolerance();
        ColorComponents breakup = new ColorComponents();

                //one tap to proceed past stage clear and clicking points


                //checks if quest borders are there and should be working fine imported from TT

                while (maxruns2 != 100) {
                    //change to quests?
                    int tolcheckofborder[] = breakup.ColorComponentsMethod(createArray.Clear());
                    checktol.HMClear(tolcheckofborder, tolcheckofborder.length);

                    if (checktol.HMClear(tolcheckofborder, tolcheckofborder.length) == true) {
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

                    }



                    maxruns2++;
                }

        }
    }

