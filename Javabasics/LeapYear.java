import java.util.*;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Year :");
        int year = sc.nextInt();
        Boolean x = (year % 4) == 0;
        Boolean y = (year % 100) != 0;
        Boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.print(year + " is Leap year");
        } else {
            System.out.println(year + " is Not a leap year");
        }
    }
}
