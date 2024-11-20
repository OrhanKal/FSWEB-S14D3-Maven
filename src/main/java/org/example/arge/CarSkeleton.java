package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        System.out.println("className: "+ getClass().getSimpleName());
        return getName()+ " starting engine.";
    }

    public String drive(){
        runEngine(this);
        return getName() + " is driving...";
    }
    protected void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof ElectricCar){
            double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("The car engine is staring with electric. Per charge: " + avgKmPerCharge + " battery size: " + batterySize);

        }else if (carSkeleton instanceof HybridCar){
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("The car engine is staring with hybrid. Per charge: " + hybridCar.getAvgKmPerLiter() + " battery size: " + hybridCar.getBatterySize() + " cylinder: " + hybridCar.getCylinders());

        } else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.println("The car engine is staring with gaspowered car. Per charge: " + gasPoweredCar.getAverageKmPerLiter());

        } else {
            System.out.println("invalid var type!");
        }
    }
}
