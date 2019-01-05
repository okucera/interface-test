package cz.kuci.abstracts;

public class Tesla extends CarImpl {
    boolean electricEngine = false;
    int energy;

    public Tesla() {
        this.type = "Tesla";
        this.fuelType = FuelType.ELECTRIC;
    }

    public Tesla(int energy) {
        this.energy = energy;
        this.type = "Tesla";
        this.fuelType = FuelType.ELECTRIC;
    }

    @Override
    public String startMethod() {
        //nejaka logika specificka pro startovani motoru tesly :-D
        if(energy > 20) {
            electricEngine = true;
        } else {
            electricEngine = false;
        }
        this.engine = electricEngine;

        //auto nastartovalo pomoci karty
        return "card";
    }

    @Override
    public void setFuelStatus(int fuelStatus) {
        energy = fuelStatus;
    }

    @Override
    public boolean internalValidation() {
        return energy > 20;
    }
}
