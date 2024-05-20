
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clock {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss"); // Formats the time for Hours, Minutes, and Seconds

        Timer timer = new Timer(1000, new ActionListener() { // Timer triggers every 1 second
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("Current time: " + formatter.format(now));
            }
        });

        timer.start(); // Timer start

        try {
            while (true) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}