package OOP.Exceptions.Examples;

import java.util.Scanner;

public class Examples {

  static void DividedByZero(){
    int num1, num2;
    num1 = 1;
    num2 = 0;

    System.out.println(num1/num2);
    System.out.println("Hello, Ryuk");
  
  }

  static void WrongType(){
    Scanner entry = new Scanner(System.in);

    
    System.out.println("Type a number");
    int numero = entry.nextInt();

    System.out.println(numero);
  
  }

  public static void main(String[] args) {
    
    WrongType();

    
}
}
