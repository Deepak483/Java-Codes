/**
 * Variables_Arguments
 */
public class Variables_Arguments {

  public static void main(String[] args) {
    Calc obj = new Calc();
    System.out.println(obj.add(4, 5, 83, 7));

  }
}

class Calc {
  public int add(int... n) { // Variable length Argument
    int sum = 0;
    for (int k : n) {
      sum = sum + k;

    }
    return sum;
  }
}