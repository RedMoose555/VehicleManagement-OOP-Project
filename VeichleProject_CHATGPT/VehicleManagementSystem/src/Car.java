public class Car extends Vehicle {
    //Creation of Variables
    protected float trunkCapacity;
    protected CarTransmission carTransmission;


    //Getters and Setters
    public float getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(float trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    public CarTransmission getCarTransmission() {
        return carTransmission;
    }

    public void setCarTransmission(CarTransmission carTransmission) {
        this.carTransmission = carTransmission;
    }

    //Constructor
    public Car(String make, String model, int year,FuelType fuelType, float mileage, float trunkCapacity,CarTransmission carTransmission) {
        //using a superClass (Vehicle)
        super(make, model, year, fuelType, mileage);
        this.trunkCapacity = trunkCapacity;
        this.carTransmission = carTransmission;
    }

    //personalised Car startVehicle method
    @Override
    public String startVehicle(){
        return
        super.startVehicle() + "check your parking brake!";
    }

    //toString method to display the Vehicle details & the Car specific details
    @Override
    public String toString(){
        return
        super.toString() + "* The trunk capacity: " + this.trunkCapacity + "L" + "\n" +
                "* The car's transmission: " + this.carTransmission + "\n";
    }
}
