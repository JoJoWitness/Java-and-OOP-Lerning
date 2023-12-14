package Exercises.OOP.Quadrilateral_Exer;

import java.util.Scanner;

public class Quadrilateral {
    
    int isSquare;
    int verticalSizes, horizontalSizes;

    Scanner entry = new Scanner(System.in);

  

    public void setIsSquare(){
        System.out.println("The figure is a square? answer with 0 for no; 1 for yes");
        
        isSquare = entry.nextInt();

        while ((isSquare != 1) && (isSquare != 0)) {
            System.out.println("Please, enter just 1 or 0.");
            isSquare = entry.nextInt();
        }
        
        System.out.println("Thank you, now you may proceed");
    }

    public void setSizes(){
        if(isSquare == 1){
            System.out.println("Enter the lenght of the sides. (Is assumed that they are in cm)");
            verticalSizes = entry.nextInt();
            horizontalSizes = verticalSizes;
        }
        else{
            System.out.println("Enter the lenght of the vertical sides. (Is assumed that they are in cm)");
            verticalSizes = entry.nextInt();
            System.out.println("Enter the lenght of the horizontal sides. (Is assumed that they are in cm)");
            horizontalSizes = entry.nextInt();
        }
    }

    public int getArea(){
        return verticalSizes * horizontalSizes;
    }

    public int getPerimeter(){
        return (verticalSizes*2) + (horizontalSizes*2);
    }
    
}
