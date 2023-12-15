package OOP.Polymorphims;

public class VehicleSports extends Vehicle{
    
    private int capacity;

    public VehicleSports(String plate, String brand, String model, int capacity) {
        super(plate, brand, model);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String showData(){
        return "Plate: "+ plate + "\nBrand: " + brand +"\nModel: " + model + "\nCapacity: " + capacity;
    }

}
