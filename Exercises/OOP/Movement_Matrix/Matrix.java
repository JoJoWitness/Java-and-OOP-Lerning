package Exercises.OOP.Movement_Matrix;

import java.util.Scanner;

public class Matrix {
    int rows, columns;
    int flag;
    private String matrix[][];

    Point point = new Point(0, 0);

    Scanner entry = new Scanner(System.in);

    

    public void setMatrix(){
        System.out.println("How many column does the matrix have?");
        columns = entry.nextInt();

        System.out.println("How many rows does the matrix have?");
        rows = entry.nextInt();

        matrix = new String[rows][columns];
    }

    public void drawMatrix(){
        
        System.out.println(" ");

        for(int i = 0; i < rows; i++){
            for(int j=0; j < columns; j++){
                if((i == Point.x) && (j == Point.y)){
                matrix[i][j] = "X";
                System.out.print(matrix[i][j] + " ");
                }
                else{
                   matrix[i][j] = "O";
                System.out.print(matrix[i][j] + " "); 
                }
                
            }
            System.out.println("\n");

           
              
        }

     
    }

    public void refreshMatrix(){
         point.movePoint(rows, columns);
         flag = point.flag;
    }

   

    
}
