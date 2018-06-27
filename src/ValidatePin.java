import java.util.Scanner;

public class ValidatePin {
   public static boolean validatePin(String pin) throws IllegalStateException {
      if (pin.matches("[1-9]{4}") || pin.matches("[1-9]{6}"))
       return true ;
      else
         return false;
   }

   public static void main(String[] args){
      ValidatePin vp = new ValidatePin();
      System.out.println("Enter ATM pin:");
      Scanner sc = new Scanner(System.in);
      String pin = sc.nextLine();
      System.out.println(vp.validatePin(pin));
   }
}
