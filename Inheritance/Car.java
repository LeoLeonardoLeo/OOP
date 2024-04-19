public class Car extends Vehicle{

    private int year;
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model);
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }
    public int getYear() {
        return year;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public String toString() {
        return  "Make: " + getMake() + '\'' +
                "Model: " + getModel() + '\'' +
                "Year: " + year +
                "Number Of Doors: " + numberOfDoors;
    }
}
