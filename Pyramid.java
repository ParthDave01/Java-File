public class Pyramid {
  public static void main(String[] args) {
      int n = 5; // number of rows
      for (int i = 1; i <= n; i++) {
          // Print spaces
          for (int j = i; j < n; j++) {
              System.out.print(" ");
          }
          // Print stars
          for (int k = 1; k <= (2 * i - 1); k++) {
              System.out.print("*");
          }
          // Move to the next line
          System.out.println();
      }
  }
}
