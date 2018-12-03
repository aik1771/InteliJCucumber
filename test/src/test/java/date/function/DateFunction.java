package date.function;

/**
 * Created by agolubev on 12/2/18.
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFunction {


    public static String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Date function is " +dtf.format(now));
        return dtf.format(now);
    }

    public static String getName()

    {
        DateTimeFormatter email = DateTimeFormatter.ofPattern("dd-M-yyyy hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String newEmailTemp = email.format(now);
        newEmailTemp=newEmailTemp.replaceAll(" ", "_");
        newEmailTemp = newEmailTemp.replaceAll(":", "_");
        newEmailTemp = newEmailTemp.replaceAll("  ", "_");
        String newEmail = "test"+newEmailTemp+"@test.com";
        // System.out.println("Date function is " +email.format(now));

        return newEmail;


    }

}