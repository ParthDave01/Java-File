
//  Write a Java program to input week number (1-7) and print day of weekname  using switch case.
import java.util.*;

public class WeekInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day");
         
        int Weeks = sc.nextInt();
        switch (Weeks) {
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tue");
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default : System.out.print("Not a week");

        }
    }
}
