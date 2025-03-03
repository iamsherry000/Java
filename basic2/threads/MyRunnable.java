package basic2.threads;

public class MyRunnable implements Runnable{
    
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            try{
                Thread.sleep(1000); // 1 sec
            }
            catch(InterruptedException e) {
                System.out.println("Thread was intterrupted");
            }
    
            if(i == 5) {
                System.out.println("Time's up");
                System.exit(0); // end the code
            }
        }
    }
}
