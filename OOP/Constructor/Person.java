package OOP.Constructor;

public class Person {

    String name, id;
    int age;



    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String id){
        this.id = id;
    }


    public void showData(){
        System.out.println("Name of the person: "+name);
        System.out.println("Age of the person: "+age);
    }

    public void showData(String id){
        System.out.println("Your ID is: "+ id);
    }
}
