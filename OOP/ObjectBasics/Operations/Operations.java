package OOP.ObjectBasics.Operations;

import java.util.Scanner;

public class Operations {
    
    int num1;
    int num2;
    int addition;
    int substraction;
    int mult;
    int div;


    Scanner entry = new Scanner(System.in);

    public void readNumber() {
        

        System.out.println("Enter two numbers");
        num1 = entry.nextInt();
        num2 = entry.nextInt();

    }

    public void add(){
        addition = num1 + num2;
    }

    public void sub(){
        substraction = num1 - num2;
    }

    public void multiplicate(){
        mult= num1 * num2;
    }

    public void divide(){
        div = num1 / num2;
    }

    public void showResults(){

        System.out.println("The addition is: "+ addition);
        System.out.println("The substraction is: "+ substraction);
        System.out.println("The multiplication is: "+ mult);
        System.out.println("The de division is: "+ div);
        

    }

}

