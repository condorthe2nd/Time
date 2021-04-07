import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//had to learn a lot about time for this but it was interesting
public class Time3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Start and end time inputs
        System.out.print("Enter start time (hh:mm:ss aa): ");
        String starttime = input.nextLine();

        System.out.print("Enter end time (hh:mm:ss aa): ");
        String endtime = input.nextLine();
        //date formatter
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss aa");

        Date d1 = null;
        Date d2 = null;
        //tests for date if its a good date then it prints difference
        try {
            //variable for parsed inputs
            d1 = format.parse(starttime);
            d2 = format.parse(endtime);

            // in milliseconds
            long diff = Math.abs(d2.getTime() - d1.getTime());

            long diffSeconds = (diff / 1000) % 60;
            long diffMinutes = (diff / (60 * 1000)%60);
            long diffHours = (diff / (60 * 60 * 1000));

            System.out.print(diffHours + " hours " + diffMinutes + " minutes and " + diffSeconds + " seconds.");
        } catch (Exception e) {
            System.out.println("Invalid format");
        }
    }
}