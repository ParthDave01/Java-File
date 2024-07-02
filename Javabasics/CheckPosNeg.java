import java.util.*;

public class CheckPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int n = sc.nextInt();

        if (n >= 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
