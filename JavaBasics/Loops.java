import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        Scanner entry = new Scanner(System.in);
        int question;

        System.out.println("Which conditional do you want to see? Enter: 0 for while; 1 for do while; 2 for for");
        question = entry.nextInt();

        if(question == 0){
            int i = 0;
            System.out.println("My ryuk is barking");
            System.out.println("Ryuk");

            while(i < 5){
                System.out.println("Guau Guau");
                i++;
        }
        }
        else if(question == 1){
            int i = 1;
            System.out.println("My ryuk is barking a little less than before");
            System.out.println("Ryuk");

            do{
                System.out.println("Guau Guau");
                i++;
            }while(i < 2);
        
        }
        else if(question == 2){
            System.out.println("My ryuk is barking a lot");
            System.out.println("Ryuk");

            for(int i = 0; i < 10; i++){
            System.out.println("Guau Guau");
            }
        }
}
}