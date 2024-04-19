public class Main {
    public static void main(String[] args) {
        // creating a vehicle just because
        Vehicle vehicle = new Vehicle("Chevy", "Camaro");

        Car car = new Car("Chevy", "Camaro", 2022, 2);

        System.out.println(car);
        car.goForward(); //engine is off
        car.startEngine();

        System.out.println();

        car.goForward();
        car.goForward();
        car.brake();

        System.out.println();

        int goFor = 10;
        for (int i = 0; i < goFor; i++) {
            car.goForward();
        }

        System.out.println();
        car.turnOffEngine();
        int stop = 10;
        for (int i = 0; i < stop; i++) {
            car.brake();
        }
        car.turnOffEngine();
        car.goForward();

    }
}