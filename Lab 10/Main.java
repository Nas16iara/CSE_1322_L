package RanasiaC;
import java.util.Scanner;

public class Main {
    public static int time(String time) throws InvalidTimeException {
        String[] splitTime = time.split(":", 3);
        int hours;
        int timeTotal;
        if (!(splitTime.length==3
                &&(splitTime[0].matches("\\d\\d")
                ||splitTime[0].matches("\\d"))
                && (splitTime[1].matches("\\d\\d")
                || splitTime[1].matches("\\d"))
                && (splitTime[2].matches("\\d\\d")
                || splitTime[2].matches("\\d")))) {
            throw new InvalidTimeException("Enter a valid time");
        } else {
            hours = Integer.parseInt(splitTime[0]);
            int minutes = Integer.parseInt(splitTime[1]);
            int seconds = Integer.parseInt(splitTime[2]);
            if (hours > 24 || hours < 0) {
                throw new InvalidTimeException("Hour must be below 24");
            }
            if (minutes > 59 || minutes < 0) {
                throw new InvalidTimeException("Minutes must be less than 60");
            }
            if (seconds > 59 || seconds  <0) {
                throw new InvalidTimeException("Seconds must be less than 60");
            }
            final int sixty_minutes = 60;
            timeTotal = 0;
            timeTotal = ((hours * sixty_minutes*sixty_minutes) + (minutes*sixty_minutes) + seconds);
        }

        return timeTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time1;
        String time2;
        int seconds1 = 0;
        int seconds2 = 0;
        try {
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            time1 = sc.nextLine();
            seconds1 = time(time1);
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            time2 = sc.nextLine();
            seconds2 = time(time2);
            int seconds = seconds2 - seconds1;
            System.out.println("Difference in seconds: " + seconds);
        } catch (Exception first) {
            System.out.println(first.toString().substring(9));
        }
    }
}
