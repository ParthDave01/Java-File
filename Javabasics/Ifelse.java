import java.util.*;
public class Ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("adult : drive,Vote");
        }
        if(age>=13 && age<=18){
            System.out.println("adult :Teenager");
        }
        else{
            System.out.println("not adult");
        }
    }

}
