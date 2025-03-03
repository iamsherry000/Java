package CourseProject;

import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    public static void main(String[] args) {
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 5;

            @Override
            public void run() {
                System.err.println(count);
                count--;
                if(count < 0) {
                    System.out.println("Happy New Year");
                    timer.cancel(); // otherwise it wont stop, i.e -1, -2...
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
