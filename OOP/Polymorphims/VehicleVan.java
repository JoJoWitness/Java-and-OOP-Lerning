package OOP.Polymorphims;

public class VehicleVan extends Vehicle{

    private int load;

    public VehicleVan(String plate, String brand, String model, int load) {
        super(plate, brand, model);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    @Override
    public String showData(){
        return "Plate: "+ plate + "\nBrand: " + brand +"\nModel: " + model + "\nLoad: " + load;
    }
    
}
