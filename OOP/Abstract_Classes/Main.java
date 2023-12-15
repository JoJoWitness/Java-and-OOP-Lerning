package OOP.Abstract_Classes;

import OOP.Abstract_Classes.TypesOfAnimals.Carnivore;
import OOP.Abstract_Classes.TypesOfAnimals.Herbivore;
import OOP.Abstract_Classes.TypesOfLivingBeings.Plants;

public class Main {
    public static void main(String[] args) {
        Carnivore carnivore = new Carnivore();
        Herbivore herbivore = new Herbivore();
        Plants plants = new Plants();

        plants.eat();
        carnivore.eat();
        herbivore.eat();
    }
}
