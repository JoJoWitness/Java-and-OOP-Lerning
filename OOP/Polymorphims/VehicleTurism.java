package OOP.Polymorphims;

public class VehicleTurism extends Vehicle{

    private int doors;

    public VehicleTurism(String plate, String brand, String model, int doors) {
        super(plate, brand, model);
        this.doors = doors;
    }
    
      public int getnDoors() {
        return doors;
    }

    @Override
    public String showData(){
        return "Plate: "+ plate + "\nBrand: " + brand +"\nModel: " + model + "\nDoors: " + doors;
    }

    
}
