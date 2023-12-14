package OOP.Getters_Setters;

public class GS1 {

    private int age;
    private String name;
    private final String pet = "Ryuk";

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getPet(){
        return pet;
    }
    
}
