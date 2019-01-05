package cz.kuci.abstracts;

public class Skoda120 extends CarImpl {
    boolean fuelEngine = true;
    int fuelStatus;

    public Skoda120() {
        this.type = "Skoda 120";
        this.fuelType = FuelType.FUEL;
    }

    public Skoda120(int fuelStatus) {
        this.fuelStatus = fuelStatus;
        this.type = "Skoda 120";
        this.fuelType = FuelType.FUEL;
    }

    @Override
    public String startMethod() {
        //nejaka logika specificka pro startovani motoru skodovky :-D
        if(fuelStatus == 0) {
            fuelEngine = false;
        } else {
            fuelEngine = true;
        }
        engine = fuelEngine;
        return "key";
    }

    @Override
    public void setFuelStatus(int fuelStatus) {
        this.fuelStatus = fuelStatus;
    }

    @Override
    public boolean internalValidation() {
        return fuelStatus > 0;
    }
}
