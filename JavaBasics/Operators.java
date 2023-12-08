import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        float num1,num2;

        Scanner entry = new Scanner(System.in);

        System.out.println("Entre two numbers:");
        num1 = entry.nextFloat();
        num2 = entry.nextFloat();

        System.out.println("The sum is: " +(num1+num2));
        System.out.println("The rest is: " +(num1-num2));
        System.out.println("The multiplication is: " +(num1*num2));
        System.out.println("The division is: " +(num1/num2));
        System.out.println("The module is: " +(num1%num2));

        num1 += 5;
        num2--;
        System.out.println("The first number plus five is: "+num1);
        System.out.println("The second number minus one is: "+num2);

    }
}
