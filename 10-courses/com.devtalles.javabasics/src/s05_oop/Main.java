package s05oop;

import utilities.ConsoleStyle;

public class Main {
    public static void main(String[] args) {

        /*Vehicle car = new Vehicle("Ford Mustang", "GT", 1997);

        car.setYear(0);
        System.out.println(ConsoleStyle.getBrightMagenta(car.toString()));*/

        Vehicle myCar = new Car("Toyota", "Corolla", 2021, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2021, false);

        ((Car)myCar).start();
        ((Motorcycle)motorcycle).start();

        printVehicle(myCar);
        printVehicle(motorcycle);
    }

    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}
