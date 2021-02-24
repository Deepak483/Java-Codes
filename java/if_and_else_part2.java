import java.util.Scanner;

public class if_and_else_part2 {

  public static void main(String[] args) 
  {
    Scanner srn = new Scanner(System.in);
    System.out.println("Enter the marks between 1 to 100:");
    int marks = srn.nextInt();
    if(marks>90){
      System.out.println("excellent");
    }
    else if(marks>80 && marks<=90)
    {
      System.out.println("good");
    }
    else if(marks>70 && marks<=80)
    {
      System.out.println("fair");
    }
    else if(marks>60 && marks<=70)
    {
      System.out.println("meet expectations");
    }
    else{
      System.out.println("need lots of attention");
    }

  }
}