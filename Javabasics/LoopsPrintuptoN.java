import java.util.*;

public class LoopsPrintuptoN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();
    }
}