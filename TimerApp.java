import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class TimerApp {
    private static Timer timer;
    private static int secondsRemaining;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the duration in seconds: ");
        int duration = scanner.nextInt();
        secondsRemaining = duration;

        while(duration!=0){
            duration-=1;
            Thread.sleep(1000);
            System.out.println("Time remaining: " + duration);
        }



        scanner.close();
    }
}
