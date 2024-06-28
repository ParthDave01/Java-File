import java.util.Scanner;
public class Operators{
    
    public void add(int a,int b)
    {
        System.out.println("Sum is:"+(a+b));
    }
    public void sub(int a,int b)
    {
        System.out.println("Sub is:"+(a-b));
    }
    public void multi(int a,int b)
    {
        System.out.println("Multiply is:"+(a*b));
    }
    public void div(int a,int b)
    {
        System.out.println("Div is:"+(a/b));
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