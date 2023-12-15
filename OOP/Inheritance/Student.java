package OOP.Inheritance;

public class Student extends Person {

    private int studentID;
    private float finalNote;

    public Student(String name, String lastname, int age, int studentID, float finalNote) {
        super(name, lastname, age);
        this.studentID = studentID;
        this.finalNote = finalNote;
    }

    public void showData(){
        System.out.println("Name: " + getName());
        System.out.println("Last Name: " +getLastname());
        System.out.println("Age: "+ getAge());
        System.out.println("Student ID: "+ studentID);
        System.out.println("Final note: "+ finalNote);
    }
    
   
    
}
