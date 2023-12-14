package Exercises.OOP.Quadrilateral_Exer;

import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        Quadrilateral quad = new Quadrilateral();     

        int flag = 1;
        int optionMenu;

        System.out.println("");
        System.out.println("Welcome, please answer the folowing questions");
        quad.setIsSquare();
        quad.setSizes();

        while (flag != 0) {
            System.out.println("");
            System.out.println("What do you want to do with you quadrilateral?");
            System.out.println("If you want to know it's perimeter, enter 0.");
            System.out.println("If you want to know it's area, enter 1.");
            System.out.println("If you want to end the program, enter 2.");

            optionMenu = entry.nextInt();

            if(optionMenu == 2){
                flag = 0;
                System.out.println("");
                System.out.println("Thank you for using the programn");
            }
            else if(optionMenu == 0){
                System.out.println("");
                System.out.println("The perimeter of your quadrilateral is "+ quad.getPerimeter() +"cm.");
            }
            else if(optionMenu == 1){
                System.out.println("");
                System.out.println("The area of your quadrilateral is "+ quad.getArea() +"cm^2.");
            }
            else{
                System.out.println("");
                System.out.println("Please, enter one of the number you were told.");
            }
        }

        quad.getPerimeter();
        quad.getArea();

        
   
}
}