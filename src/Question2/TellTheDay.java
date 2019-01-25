package Question2;

import java.util.Calendar;
import java.util.Scanner;

public class TellTheDay {

    Scanner sc = new Scanner(System.in);

    public static void whatDayis(String date){
        String[] daysOfWeek = {"","Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
        Calendar calendar = Calendar.getInstance();

        String[] st = date.split("[-/]");
        calendar.set(Calendar.YEAR,Integer.parseInt(st[2]));
        calendar.set(Calendar.MONTH, Integer.parseInt(st[1])-1);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(st[0]));

        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(daysOfWeek[weekDay]);
    }

    public static void main(String[] args) {
        whatDayis("01-04/2011");
    }


}
