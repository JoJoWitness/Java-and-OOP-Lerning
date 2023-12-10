package BasicAlgorithms;

import java.util.Scanner;

public class Insertion {
    
    public static void main(String[] args) {
       
        Scanner entry = new Scanner(System.in);
        int n, numArray[], temp, pos;

        System.out.println("Welcome to this code practice of a insertion sorter.");
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

        for(int i = 0; i < n; i++){
            pos = i;
            temp = numArray[i];
            
            while ((pos > 0) && (numArray[pos-1] > temp)) {
                numArray[pos] = numArray[pos-1];
                pos--;
            };

            numArray[pos] = temp;

        }

        System.out.println("Done!, now you array looks like: ");

            for (int i : numArray) {
                System.out.print(i + ", ");
            }

        System.out.println("");
        
 
    }

    
}

