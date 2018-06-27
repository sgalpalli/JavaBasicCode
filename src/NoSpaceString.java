import java.util.Scanner;

public class NoSpaceString {
   static String noSpace(String x) {
      x = x.replaceAll("\\s+","");
      return x;
   }
   public static void main(String[] args){
      NoSpaceString kat = new NoSpaceString();
      String input;
      System.out.println("Enter string:");
      Scanner sc = new Scanner(System.in);
      input = sc.nextLine();
      System.out.println(kat.noSpace(input));
   }
}