import java.awt.Robot;
import java.awt.event.InputEvent;

public class Clicks {

    public static void leftClick(Robot robot) {

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
    //left click with button held down for 1-100 ms, not sure if i should use this
    public static void leftClickDelayed(Robot robot) {
        int randomdelay = (int) Math.random()*100;
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(randomdelay);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }


}
