package Exercises.OOP.Movement_Matrix;

public class Main {

    public static void main(String[] args) {
         Matrix matrix = new Matrix();
         int flag = 1;

        matrix.setMatrix();

        System.out.println("Welcome to this exercise");
        System.out.println("To move your pointer, you need to typeL w, a, s, d.");
        System.out.println("If you want to end the programn, type any letter instead of the former\n");
    
        while(flag == 1) {
            matrix.drawMatrix();
            matrix.refreshMatrix();
            flag = matrix.flag;
        }

        System.out.println("Thank you for using our system!");
       
         matrix.drawMatrix();
    }
   
    
}
