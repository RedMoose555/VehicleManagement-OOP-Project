
//Creation of Enums
enum FuelType{Gasoline,Diesel,Electric}
enum CarTransmission{Automatic,Manual}

//Main Class
public class Main {
    public static void main(String[] args) {
    //populating car class
    Car c1 = new Car("BMW","A6",2011,FuelType.Electric,67000,4,CarTransmission.Automatic);

    //populating Truck class
    Truck t1 = new Truck("Scania","idk",2016,FuelType.Diesel,142000,60,true);

    //Displaying the populated objects
    System.out.println(c1);
    System.out.println(t1);
    }
}