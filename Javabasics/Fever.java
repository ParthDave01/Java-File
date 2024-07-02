import java.util.*;
public class Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temp is :");
        double temp = sc.nextFloat();
        if(temp > 100){
            System.out.println("It's a Fever");
        }
        else{
            System.out.println("It's not a fever");
        }
    }
}