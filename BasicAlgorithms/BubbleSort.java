package BasicAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    
    public static void main(String[] args) {
       
        Scanner entry = new Scanner(System.in);
        int n, numArray[];

        System.out.println("Welcome to this code practice of a bubble sort.");
        System.out.println("Please, enter your desired array lenght.");
        n = entry.nextInt();

        numArray = new int[n];

        for(int i = 0; i < n ; i++){
            System.out.println("Type any random number: ");
            numArray[i] = entry.nextInt();
        }

        System.out.println("Now, your arrays looks like: ");
        for (int i : numArray) {
            System.out.print(i + ", ");
        }

        System.out.println("\nThe System will sorted it from smaller to bigger.");

        for(int i = 0; i < (n-1); i++){
            for(int j = 0; j < (n-1); j++){
                if(numArray[j] > numArray[j+1]){
                    int temp = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = temp;
                }
                else{
                    break;
                }

        }

      
 
    }

    System.out.println("Done!, now you array looks like: ");

          for (int i : numArray) {
            System.out.print(i + ", ");
        }

    System.out.println("");
    
}

}
