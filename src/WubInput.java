import java.util.Scanner;

public class WubInput {

   public void inputString(){
      System.out.println("Enter your string:");
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      input = input.toUpperCase();
      System.out.println(input);
      if (input.length()>200)
         System.out.println("Input length must be less than 200");
      songDecoder(input);
   }

   public void songDecoder(String input){
      input = input.replaceAll("WUB"," ");
      input = input.replaceAll("\\s{2,}"," ").trim();
      System.out.println(input);
   }
   public static void main(String[] args){
      WubInput wi = new WubInput();
      wi.inputString();
   }
}
