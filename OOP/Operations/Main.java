package OOP.Operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operations op = new Operations();

        int num1, num2;

        Scanner entry = new Scanner(System.in);
        System.out.println("Enter two numbers");

        num1 = entry.nextInt();
        num2 = entry.nextInt();

        System.out.println("The sum is: "+ op.add(num1, num2));
        System.out.println("The substraction is: "+ op.sub(num1, num2));
        System.out.println("The multiplication is: "+ op.multiplicate(num1, num2));
        System.out.println("The division is: "+ op.divide(num1, num2));
       
   
    }
    
}
