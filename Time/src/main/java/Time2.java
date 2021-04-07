import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start time (hh:mm:ss aa): ");
        String starttime = input.nextLine();

        System.out.print("Enter end time (hh:mm:ss aa): ");
        String endtime = input.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss aa");

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(starttime);
            d2 = format.parse(endtime);

            // in milliseconds
            long diff = Math.abs(d2.getTime() - d1.getTime());
            long diffHours = (diff / 1000)%(60*60);
            long diffSeconds = (diff / 1000) % 60;
            long diffMinutes = (diff / (60 * 1000));

            System.out.print(diffHours+" hours " +diffMinutes + " minutes and " + diffSeconds + " seconds.");
        } catch (Exception e) {
            System.out.println("Invalid format");
        }
    }
}
