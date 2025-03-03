package basic2;

import java.util.Timer;
import java.util.TimerTask;

public class TimerAndTaskExample {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            // can also set a count to make it evaluate only several time
            @Override
            public void run(){
                System.out.println("do task");
            }
        };

        // schedule(task, delay start, repeatedly)
        timer.schedule(task, 3000, 1000); // 3000 = 3 seconds
    }
}
