import java.util.*;
public class NewOperators{
    public static void main(){
        {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int sum = a+b;
       int sub = a-b;
       int multi = a*b;
       int div = a%b;
       System.out.println("sum is:"+(a+b));
       System.out.println("sub is:"+(a-b));
       System.out.println("multi is:"+(a*b));
       System.out.println("div is:"+(a%b));
    }
}

     // bitwise operators

     public void bitwiseAnd(int a,int b)
    {
        System.out.println("Bitwise And Result:"+(a&b));
    }
    public void bitwiseOR(int a,int b)
    {
        System.out.println("Bitwise OR Result:"+(a|b));
    }
    public void bitwiseXor(int a,int b)
    {
        System.out.println("Bitwise Xor Result:"+(a^b));
    }
    public void bitwiseLeftShift(int a,int b)
    {
        System.out.println("Bitwise LeftShift Result:"+(a>>b));
    }
    public void bitwiseRightShift(int a,int b)
    {
        System.out.println("Bitwise RightShift Result:"+(a<<b));
    }
    
    public static void main(String [] args){
        Operators calculator=new Operators();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first and second values");
        calculator.add(scanner.nextInt(),scanner.nextInt());
        System.out.println("Enter the first and second values");
        calculator.sub(scanner.nextInt(),scanner.nextInt());
        System.out.println("Enter the first and second values");
        calculator.multi(scanner.nextInt(),scanner.nextInt());
        System.out.println("Enter the first and second values");
        calculator.div(scanner.nextInt(),scanner.nextInt());
        System.out.println("Enter the first and second values");
        calculator.div(scanner.nextInt(),scanner.nextInt());
    }
}
