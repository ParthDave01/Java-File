import java.util.*;

public class SwitchCalculator {
      public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b = sc.nextInt();
            System.out.println("Enter operator:");
            char operator = sc.next().charAt(0); // sc.next se sirf string milega or charAt(0) se single char print karwa skte he 

            switch (operator) {

                  case '+':
                        System.out.println(a + b);
                        break;
                  case '-':
                        System.out.println(a - b);
                        break;
                  case '*':
                        System.out.println(a * b);
                        break;
                  case '%':
                        System.out.println(a % b);
                        break;
                  case '/':
                        System.out.println(a / b);
                        break;
                  default:
                        System.out.println("wrong operator");
            }
      }
}
