// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;

public class TotalBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Pencil = 5f;
        float Pen = 10f;
        float Eraser = 3f;

        Float TotalBill = (Pencil + Pen + Eraser);
        System.out.println(TotalBill);
        // adding gst
        float total = TotalBill+(0.18f * TotalBill);
        System.out.println(total);
    }
}
