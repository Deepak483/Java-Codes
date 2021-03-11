import java.util.Stack;

import java.util.Scanner;

/**
 * Duplicate_Brackets
 */
public class Duplicate_Brackets {

  public static void main(String[] args) {
    // write your code here
    Scanner s = new Scanner(System.in);
    Stack<Character> st = new Stack<>();
    String str = s.nextLine();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == ')') {
        if (st.peek() == ')') {
          System.out.println(true);
          return;
        } else {
          while (st.peek() != ')') {
            st.pop();
          }
          st.pop();
        }
      } else {
        st.push(ch);
      }

    }
    System.out.println(false);

  }
}
