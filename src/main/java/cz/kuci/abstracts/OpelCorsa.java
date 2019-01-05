package cz.kuci.abstracts;

public class OpelCorsa extends CarImpl {
    boolean fuelEngine = true;
    int fuelStatus;

    public OpelCorsa() {
        this.type = "Opel Corsa";
        this.fuelType = FuelType.FUEL;
    }

    public OpelCorsa(int fuelStatus) {
        this.fuelStatus = fuelStatus;
        this.type = "Opel Corsa";
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
