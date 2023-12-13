package OOP.ObjectBasics;

public class Car {
    
    String color;
    String brand;
    int km;
    
    public static void main(String[] args) {
        
        Car ryukCar = new Car();


        ryukCar.color = "Red";
        ryukCar.brand=" Ferrari";
        ryukCar.km= 0;

        System.out.println("Ryuk's car color is: " +ryukCar.color);
        System.out.println("Ryuk's car brand is: " +ryukCar.brand);
        System.out.println("Ryuk's car km are: " +ryukCar.km);

    }
    
}
