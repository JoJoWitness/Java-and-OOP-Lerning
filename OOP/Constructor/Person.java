package OOP.Constructor;

public class Person {

    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }



    public void showData(){
        System.out.println("Name of the person: "+name);
        System.out.println("Age of the person: "+age);
    }
}
