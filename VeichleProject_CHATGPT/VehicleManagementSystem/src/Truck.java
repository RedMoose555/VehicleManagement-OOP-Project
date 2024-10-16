public class Truck extends Vehicle {
    //Creation of variables
    protected float cargoCapacity;
    protected boolean hasTrailer;

    //Getters and Setters
    public float getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(float cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    //Constructor
    public Truck(String make, String model, int year,FuelType fuelType, float mileage, float cargoCapacity, boolean hasTrailer ){
        //using a superClass (Vehicle)
        super(make,model,year, fuelType,mileage);
        this.cargoCapacity = cargoCapacity;
        this.hasTrailer= hasTrailer;
    }

    //personalised Truck startVehicle method
    @Override
    public String startVehicle(){
        return
        super.startVehicle() + "check your trailer clip!!";
    }

    //toString method to display the Vehicle details & the Truck specific details
    @Override
    public String toString(){
        return super.toString() + "* The Truck's cargo Capacity: " + this.cargoCapacity + "L" + "\n" +
                "* Does the Truck have a trailer?: " + this.hasTrailer + "\n";
    }

}
