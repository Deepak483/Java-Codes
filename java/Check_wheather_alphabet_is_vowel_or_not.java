import java.util.*;

public class Check_wheather_alphabet_is_vowel_or_not {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char ch = s.next().charAt(0);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      System.out.println(ch + " is vowel");
    } else {
      System.out.println(ch + " is consonant");
    }
  }
}   