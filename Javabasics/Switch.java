import java.util.*;

public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch(number){
            case 1 : System.out.println("Hey");
                  break;
            case 2 : System.out.println("Hello");
                  break;
            case 3 : System.out.println("namste");
                  break;
            default : System.out.println("Nothing");
        }
    }
}
