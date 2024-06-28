import java.util.*;
public class elseif {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int BookPrice = sc.nextInt();
    if(BookPrice >= 100){
        System.out.println("Nice Book");
    }
    else if(BookPrice <= 90 && BookPrice>=30){
        System.out.println("Book is Good");
    }
    else{
        System.out.println("Coppy");
    }
   } 
}
