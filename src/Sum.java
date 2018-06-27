import java.util.Scanner;

public class Sum {
   public int GetSum(int a, int b)
   {
      if (a<=b)
         return Sum(a,b);
      else
         return Sum(b,a);
   }

   public int Sum(int a, int b){
      int result = 0;
      while (a<=b){
         result = result + a;
         a++;
      }
      return result;
   }
   public static void main(String[] args){
      System.out.println("Enter 2 numbers:");
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      Sum sum = new Sum();
      int result = sum.GetSum(num1,num2);
      System.out.println("Result:" +result);
   }
}
