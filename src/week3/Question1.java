package week3;
//Create a base class Vehicle and derived classes
// Car and Bike. Implement method overriding and
// demonstrate polymorphism.
 class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car is starting");
    }


    @Override
    void stop() {
        System.out.println("Car is stopping");
    }
}


class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike is starting");
    }


    @Override
    void stop() {
        System.out.println("Bike is stopping");
    }
}


public class Question1 {
    public static void main(String[] args) {

        Vehicle myVehicle;

        myVehicle = new Car();
        myVehicle.start();
        myVehicle.stop();

        myVehicle = new Bike();
        myVehicle.start();
        myVehicle.stop();
    }
}
