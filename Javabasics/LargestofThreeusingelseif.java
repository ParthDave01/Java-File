import java.util.*;
public class LargestofThreeusingelseif{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        int a= 5;
        int b= 7;
        int c= 2;
       if((a>=b) && (a>=c)){
          System.out.println('a');
       }
       else if((b>=c)){
            System.out.println('b');
       }
       else{
        System.out.println('c');
       }
    }
}