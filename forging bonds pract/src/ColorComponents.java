import java.awt.*;

public class ColorComponents {
    /*pass ColorComponents
    a Color[] array named fug1
    to obtain color components as ints
    it will return a Color[] as ints[]
    while seperating the components
    currently finished
     */

    public static int[] ColorComponentsMethod(Color[] fug1) {

        int LoneInts[] = new int[fug1.length*3];

        int j = -1;


        for (double i=0; i <fug1.length*3; i++) {

            //initialize stuff for trig
            double a = 1;
            double b = 3;
            double c = (a/b);

            double e = 14;

            double f = 6;
            double g = e/f;
            //formula for if thens
            double please = (double) Math.sin(c* Math.PI*i-g*Math.PI);

            if (i%3 == 0) {
                j++;
            }


            String yes = (String) String.valueOf(fug1[j]);
            int startIndex = yes.indexOf("j");
            int endIndex = yes.indexOf("=");
            String replacement = "";
            String toBeReplaced = yes.substring(startIndex, endIndex+1);





            //color.black now at xxx,g=xxx,b=xxx]
            String yes1 = (String) yes.replace(toBeReplaced, replacement);
            int startIndex1 = yes1.indexOf(",");
            int endIndex1 = yes1.indexOf("]");
            String replacement1 = "";
            String toBeReplaced1 = yes1.substring(startIndex1, endIndex1+1);
            String yes1final = yes1.replace(toBeReplaced1, replacement1);
            //THIS PRINTS OUT THE R OF RGB
            int yes1int = (int) Integer.valueOf(yes1final);

            //adding to array

            //yes1int is the int value of what r is = to


            //now starting g=
            /*
            i here is counting up wrong
            it needs to be addressed still
            it is moving onto the second color too ealrye
             */
            yes1 = (String) String.valueOf(fug1[j]);
            startIndex1 = yes1.indexOf("g");
            endIndex1 = yes1.indexOf("b");
            toBeReplaced1 = yes1.substring(startIndex1+2, endIndex1-1);
            int yes2int = (int) Integer.valueOf(toBeReplaced1);
            //yes1int is the int value of what r is = to




            //now starting b=
            yes1 = (String) String.valueOf(fug1[j]);
            startIndex1 = yes1.indexOf("b");
            endIndex1 = yes1.indexOf("]");
            toBeReplaced1 = yes1.substring(startIndex1+2, endIndex1);
            int yes3int = (int) Integer.valueOf(toBeReplaced1);
            //yes1int is the int value of what r OF RGB is = to


            //needs to move on to the second component
            if (i == 0 || i%3 ==0 ) {
                LoneInts[(int) i] = yes1int;
            }

            else if (Math.round(please) == 0) {
                LoneInts[(int) i] = yes2int;
            }
            else  {
                LoneInts[(int) i] = yes3int;
            }



        } return LoneInts;
    }
}
