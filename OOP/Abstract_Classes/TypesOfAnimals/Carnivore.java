package OOP.Abstract_Classes.TypesOfAnimals;

import OOP.Abstract_Classes.TypesOfLivingBeings.Animal;

public class Carnivore extends Animal {
    @Override
    public void eat(){
        System.out.println("They eat meat");
    }
}
