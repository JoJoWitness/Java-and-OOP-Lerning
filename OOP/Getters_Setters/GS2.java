package OOP.Getters_Setters;

public class GS2 {
    
    public static void main(String[] args) {
        GS1 person = new GS1();

        person.setAge(21);
        person.setName("Jordano");

        System.out.println("Hi my name is "+ person.getName() + " and I'm " +person.getAge() +" years old.");

    }

}
