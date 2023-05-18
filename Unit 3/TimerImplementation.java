import java.util.*;

// Timer in java allows you to execute a particular task at a specified time.

// We have two classes Timer and TimerTask
// Timer is the class which counts the time
// TimerTask is the class which gets executed when the time arrives


class Alarm extends TimerTask
{  
    public void run()
    {
        System.out.println("Wake up!!!!!");
    }
}

public class TimerImplementation {
    public static void main(String[] args) {
        Timer obj = new Timer("MyAlarm", false);

        obj.schedule(new Alarm(), 100, 900);
    }
}
