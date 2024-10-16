public class Vehicle {
    //Creation of Variables
    protected String make;
    protected String model;
    protected int year;
    protected FuelType fuelType;
    protected float mileage;


    //Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    //Constructor
    public Vehicle(String make, String model, int year,FuelType fuelType, float mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    //Vehicle is starting message
    public String startVehicle(){
        String message = "The vehicle is Starting!!";
        System.out.println(message);
        return message;
    }

    //toString method to display the Vehicle details
    @Override
    public String toString (){
    return "* The make: " + this.make + "\n" +
            "* The model: " + this.model + "\n"+
            "* The Year: " + this.year + "\n"+
            "* The fuel Type: " + this.fuelType + "\n"+
            "* The mileage " + this.mileage + "KM" + "\n";
    }
}
