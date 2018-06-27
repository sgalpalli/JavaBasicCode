import java.util.Scanner;

public class Vowels {
   public static int getCount(String str) {
      int vowelsCount = 0;
      for (int i =0; i< str.length();i++) {
         if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            vowelsCount++;
      }
      return vowelsCount;
   }
   public static void main(String[] args){
      System.out.println("Enter string");
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      input = input.toLowerCase();

      Vowels vowels = new Vowels();
      int count = vowels.getCount(input);
      System.out.println(count);
   }


}
