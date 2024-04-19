public class Vehicle {
    private String make;
    private String model;
    private boolean isOn;
    private int speed;
    //constructor

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        isOn = false;
        speed = 0;
    }
    //getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    //to string

    @Override
    public String toString() {
        return "Vehicle " +
                "make: " + make + '\'' +
                ", model: " + model + '\'';
    }

    public void startEngine(){
        if(!isOn) {
            System.out.println("Engine started");
            isOn = true;
            System.out.println("Engine status: " + isOn + " on");
        }
        else{
            System.out.println("Engine is already running");
        }
    }

    public void goForward() {
        if (isOn) {
            if (speed < 200) { //max speed of 200
                speed += 20;
                if (speed > 200) { //if speed is greater than 200
                    speed = 200; //cannot go forward
                    System.out.println("Max speed");
                }
                System.out.println("Vehicle is moving forward. Current speed: " + speed);
            } else {
                System.out.println("Cannot accelerate. Max speed reached.");
            }
        } else {
            System.out.println("Cannot go forward. Engine is off.");
        }
    }
    public void brake(){
        if (isOn && speed > 0){
            speed = speed - 20;
            System.out.println("Slowing down to " + speed);
        }
        else{
            System.out.println("Car is either off or completely stopped");
        }
    }
    public void turnOffEngine(){
        if(isOn){
            if(speed > 0){
                System.out.println("Cannot stop car, speed is: " + speed);
            }
            else{
                isOn = false;
                System.out.println("Car turned off");
            }
        }
    }

}
