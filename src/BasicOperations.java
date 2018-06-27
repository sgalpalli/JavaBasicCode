import java.util.Scanner;

public class BasicOperations {
   public static Integer basicMath(String op, int v1, int v2)
   {
      int v = 0;
      switch(op){
         case "+" : v = v1 + v2;
            break;
         case "-" : v = v1 - v2;
            break;
         case "*" : v = v1 * v2;
              break;
         case "/" : v = v1 / v2;
         break;
      }
      return v;
   }

   public static void main(String[] args){
      BasicOperations bo = new BasicOperations();
      System.out.println("Enter number 1 and number 2");
      int num1, num2;
      Scanner sc = new Scanner(System.in);
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      //System.out.println("Enter operation to be performed:");
      Scanner sc2 = new Scanner(System.in);
      String op;
      op = sc2.nextLine();
      System.out.println(bo.basicMath(op,num1,num2));
   }
}
