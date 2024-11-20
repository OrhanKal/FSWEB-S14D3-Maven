package org.example.arge;

public class CarFactory {

    public static void main(String[] arg){
        CarSkeleton electricCar = new ElectricCar("tesla", "tesla desc", 750, 3000);
        CarSkeleton hybtidCar = new HybridCar("togg", "togg desc", 500, 1500, 3);
        CarSkeleton gasPoweredCar = new GasPoweredCar("subaru", "subaru desc", 800, 10);
        startEngine(electricCar);
        startEngine(hybtidCar);
        startEngine(gasPoweredCar);
    }
    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }
}
