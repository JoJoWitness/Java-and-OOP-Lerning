package OOP.Polymorphims;

public class Main {
    public static void main(String[] args) {
        
        Vehicle myVehicles[] = new Vehicle[4];

        myVehicles[0] = new Vehicle("GH67", "Ferrari", "A89");
        myVehicles[1] = new VehicleTurism("678TH", "Audi", "P14", 4);
        myVehicles[2] = new VehicleSports("813UY", "Toyota", "KJ8", 500);
        myVehicles[3] = new VehicleVan("023JL", "Toyota", "J0", 2000);

        for(Vehicle vehicle: myVehicles){
            System.out.println(vehicle.showData() + "\n");
            
        }
}
}
