import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);

       
        int question;

        System.out.println("Which conditional do you want to see? Enter: 0 for if; 1 for switch");
        question = entry.nextInt();

        if(question == 0){
            System.out.println("Do you want to know how my dog is named? Enter: 1 for yes; 0 for no");

            int number;
            number = entry.nextInt();

            if(number == 1){
                System.out.println("His name is Ryuk");
            }
            else if(number == 0){
                System.out.println("Well, I don't really care what do you think, I'm gonna tell you my dog's name. His name is Ryuk");
            }
            else{
                System.out.println("I told you what to use, so please, don't be stubborn and do it well next time, thank you.");
                System.out.println("Also, his name is Ryuk");
            }
        }
        else if(question == 1){
              
            int name;

            System.out.println("Which one of my opposums you want to know its name? Enter a number between 1 and 4");

            name = entry.nextInt();

            switch (name) {
                case 1:
                    System.out.println("Her name is La Negrita");
                break;

                case 2:
                    System.out.println("His name is La Macho");
                break;

                case 3:
                    System.out.println("Her name is La De La Patita");
                break;

                case 4:
                    System.out.println("Her name is La Otra Hembra");
                break;



                default:
                    System.out.println("Since you don't know how to follow the rules, I'll tell you the name of my dog, another law-breaker just like you.");
                    System.out.println("His Name is Ryuk the Stray Dog, the DogAnarchist.");
                    break;
            }
        }
        
        else{
            System.out.println("Since you don't know how to follow the rules, I'll tell you the name of my dog, another law-breaker just like you.");
            System.out.println("His Name is Ryuk the Stray Dog, the DogAnarchist.");
        }



    }
    
}
