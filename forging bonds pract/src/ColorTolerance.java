
public class ColorTolerance {
    /*this tests if the colors collected are within the
tolerance bounds
if every component passes its test
j will count up for each component
if j is equal to total then every component passed
this will return a true
else false
 */
    public static boolean stageclearToleranceTest(int[] tolerances, int total) {
        int j = 0;

        //initialize stuff for trig
        double a = 1;
        double b = 3;
        double c = (a/b);

        double e = 14;

        double f = 6;
        double g = e/f;
        //formula for if thens


        int stageclearminR = (int) 230;
        int stageclearminG = (int) 230;
        int stageclearminB = (int) 190;

        int stageclearmaxR = (int) 255;
        int stageclearmaxG = (int) 255;
        int stageclearmaxB = (int) 255;

        //tolerances tested below

        for (int i = 0; i < total; i++){

            double please = (double) Math.sin(c* Math.PI*i-g*Math.PI);

            if (i == 0 || i%3 ==0 ) {
                if(tolerances[i]>= stageclearminR && tolerances[i] <= stageclearmaxR)
                {
                    j++; }

            }

            else if (Math.round(please) == 0) {
                if(tolerances[i]>= stageclearminG && tolerances[i] <= stageclearmaxG)
                {
                    j++; }

            }
            else  {
                if(tolerances[i]>= stageclearminB && tolerances[i] <= stageclearmaxB)
                {
                    j++; }

            }

        }


        //if tolerance tests pass return true
        if ( j == total) {
            return true; }
        else {
            return false;
        }

    }





    public static boolean gameoverToleranceTest(int[] tolerances, int total) {
        int j = 0;

        //initialize stuff for trig
        double a = 1;
        double b = 3;
        double c = (a/b);

        double e = 14;

        double f = 6;
        double g = e/f;
        //formula for if thens


        int darkredR = (int) 105;
        int darkredG = (int) 29;
        int darkredB = (int) 25;

        int lightredR = (int) 180;
        int lightredG = (int) 90;
        int lightredB = (int) 90;

        //tolerances tested below

        for (int i = 0; i < total; i++){

            double please = (double) Math.sin(c* Math.PI*i-g*Math.PI);

            if (i == 0 || i%3 ==0 ) {
                if(tolerances[i]>= darkredR && tolerances[i] <= lightredR)
                {
                    j++; }

            }

            else if (Math.round(please) == 0) {
                if(tolerances[i]>= darkredG && tolerances[i] <= lightredG)
                {
                    j++; }

            }
            else  {
                if(tolerances[i]>= darkredB && tolerances[i] <= lightredB)
                {
                    j++; }

            }

        }




        //if tolerance tests pass return true
        if ( j == total) {
            return true; }
        else {
            return false;
        }

    }
    public static boolean HMClear(int[] tolerances, int total){
        double a = 1;
        double b = 3;
        double c = (a / b);

        double e = 14;

        double f = 6;
        double g = e / f;
        int darkerR = (int) 150;
        int darkerG = (int) 230;
        int darkerB = (int) 230;

        int lighterR = (int) 255;
        int lighterG = (int) 255;
        int lighterB = (int) 255;
        int j = 0;
        for (int i = 0; i < total; i++) {


            double please = (double) Math.sin(c * Math.PI * i - g * Math.PI);

            if (i == 0 || i % 3 == 0) {
                if (tolerances[i] >= darkerR && tolerances[i] <= lighterR) {
                    j++;
                }

            } else if (Math.round(please) == 0) {
                if (tolerances[i] >= darkerG && tolerances[i] <= lighterG) {
                    j++;
                }

            } else {
                if (tolerances[i] >= darkerB && tolerances[i] <= lighterB) {
                    j++;
                }

            }

        }
        //if tolerance tests pass return true
        if (j == total) {
            return true;
        } else {
            return false;
        }
    }

    /*
       new tolerance test for the border
        */
    public static boolean borderToleranceTest(int[] tolerances, int total) {


        int j = 0;

        //initialize stuff for trig
        double a = 1;
        double b = 3;
        double c = (a / b);

        double e = 14;

        double f = 6;
        double g = e / f;
        //formula for if thens

        //could be too tight
        int darkerR = (int) 98;
        int darkerG = (int) 135;
        int darkerB = (int) 143;

        int lighterR = (int) 113;
        int lighterG = (int) 144;
        int lighterB = (int) 153;

        //tolerances tested below


        for (int i = 0; i < total; i++) {

            double please = (double) Math.sin(c * Math.PI * i - g * Math.PI);

            if (i == 0 || i % 3 == 0) {
                if (tolerances[i] >= darkerR && tolerances[i] <= lighterR) {
                    j++;
                }

            } else if (Math.round(please) == 0) {
                if (tolerances[i] >= darkerG && tolerances[i] <= lighterG) {
                    j++;
                }

            } else {
                if (tolerances[i] >= darkerB && tolerances[i] <= lighterB) {
                    j++;
                }

            }

        }
        //if tolerance tests pass return true
        if (j == total) {
            return true;
        } else {
            return false;
        }
    }
        public static boolean skip(int[] tolerances, int total){


            int j = 0;

            //initialize stuff for trig
            double a = 1;
            double b = 3;
            double c = (a/b);

            double e = 14;

            double f = 6;
            double g = e/f;
            //formula for if thens

            //could be too tight
            int darkerredR = (int) 55;
            int darkerredG = (int) 20;
            int darkerredB = (int) 19;

            int lighterredR = (int) 250;
            int lighterredG = (int) 65;
            int lighterredB = (int) 60;

            //tolerances tested below


            for (int i = 0; i < total; i++){

                double please = (double) Math.sin(c* Math.PI*i-g*Math.PI);

                if (i == 0 || i%3 ==0 ) {
                    if(tolerances[i]>= darkerredR && tolerances[i] <= lighterredR)
                    {
                        j++; }

                }

                else if (Math.round(please) == 0) {
                    if(tolerances[i]>= darkerredG && tolerances[i] <= lighterredG)
                    {
                        j++; }

                }
                else  {
                    if(tolerances[i]>= darkerredB && tolerances[i] <= lighterredB)
                    {
                        j++; }

                }

            }
            //if tolerance tests pass return true
            if ( j == total) {
                return true; }
            else {
                return false;
            }
    }

}
