import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        String word;

        System.out.println("Type a number: ");
        num = in.nextInt();

        System.out.println("Now, type a word or a phrase, pls: ");
        word = in.nextLine();

        System.out.println("Your number is: "+ num);
        System.out.println("Your word or phrase: "+ word);
    }
}
