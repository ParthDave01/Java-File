// 1st method promoting Byte , short or Char into int .

// import java.util.*;
// public class TypeConversion {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         char a = 'a';
//         char b = 'b';
//         System.out.println((int)(a));
//         System.out.println((int)(b));
//         System.out.println((int)(b-a));
//     }
//   }


// 2nd method promiting long, float, or double to.... long , float double respectively .
import java.util.*;

public class TypeConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    
        float b = 22.25f;
        long c = 23;
        double d = 30;
        double ans = b + c + d ;
        System.out.println(ans);
    }
}