import java.util.Scanner;

public class TriangleTester {
/*
Implement a method that accepts 3 integer values a, b, c.
 The method should return true if a triangle can be built with
 the sides of given length and false in any other case.
 */

   public static boolean isTriangle(int a, int b, int c){
      if (a+b>c || b+c>a || a+c>b)
         return true;
      else
         return false;
   }
public static void main(String[] args){
   System.out.println("Enter 3 integer value for side of the triangle");
   Scanner sc = new Scanner(System.in);
   int a,b,c;
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();

   System.out.println(isTriangle(a,b,c));

}
}
