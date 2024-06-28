import java.util.*;
public class IncometaxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Tax;
        int income = sc.nextInt();
        if(income<=500000){
           Tax = 0;
        }
        else if(income <500000 && income<100000){
           Tax = (int)(income*0.2);
        }
        else{
           Tax = (int) (income*0.3); 
        }
        System.out.println("Your tax is :" +Tax );
    }
}
