import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       
        Scanner entry = new Scanner(System.in);
        int n;
        double totalSum = 0;

        System.out.println("Welcome!");
        System.out.println("This isa program that give you the average of a set of numbers you type in the console:");
        System.out.println("Before starting.");
        System.out.println("How many numbers do you want to enter?");
        n = entry.nextInt();

        double[] numbers = new double[n];

        

        for(int i = 0; i < n; i++){
            System.out.println("\nEnter a number");
            numbers[i] = entry.nextDouble();
        }

        for (double d : numbers) {
            totalSum += Math.abs(d);
        
        }

        System.out.println("The average is: " + (totalSum / numbers.length)); 

        
    }
    
}
