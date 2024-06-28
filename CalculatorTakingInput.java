import java.util.*;
public class CalculatorTakingInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int multi = a*b;
        int sub = a-b;
        System.out.println(sum);
        System.out.println(multi);
        System.out.println(sub);
    }
}
 