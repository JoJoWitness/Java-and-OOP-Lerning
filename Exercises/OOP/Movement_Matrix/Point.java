package Exercises.OOP.Movement_Matrix;

import java.util.Scanner;

public class Point {
    
    static int x = 0, y = 0;
    int flag = 1;
    String movement;

    Scanner entry = new Scanner(System.in);

    public Point (int x, int y){
        Point.x = x;
        Point.y = y;
    }


   public void movePoint(int rows, int columns){
 
    movement = entry.nextLine();

    if(movement.equals("s")){
        if(x + 1 == rows){
            Point.x = 0;
        }
        else{
            Point.x += 1;
        }
    }
    else if(movement.equals("w")){
        if(x - 1 < 0){
                Point.x = (rows - 1);
            }
            else{
                Point.x -= 1;
            }
    }
    else if(movement.equals("d")){
        if(y + 1 == columns){
            Point.y = 0;
        }
        else{
            Point.y += 1;
        }
    }
    else if(movement.equals("a")){
        if(y - 1 < 0){
                Point.y = (columns - 1);
            }
            else{
                Point.y -= 1;
            }
    }
    else{

        flag = 0;
    }
    }

   
}
