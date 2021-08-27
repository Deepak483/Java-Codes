import java.util.*;

public class while_loop {

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the number till you want to print:");
    int n = scn.nextInt();
    for(int i = 1; i<=n;i++)
    {
      System.out.println(i);
    }
    System.out.println("Hey!, We are done!");
    
  }
}