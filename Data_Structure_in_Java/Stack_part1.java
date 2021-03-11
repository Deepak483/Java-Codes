package Data_Structure_in_Java;

import java.util.Stack;

public class Stack_part1 {

  public static void main(String[] args) {

    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    System.out.println(st);
    st.push(30);
    System.out.println(st);
    st.push(40);
    System.out.println(st);
    System.out.println(st.peek() + " " + st.size());
    st.pop();
    System.out.println(st.peek() + " " + st.size());
  }

}
