package cz.kuci.abstracts;

public abstract class CarImpl implements Car {
    protected boolean engine = false;
    protected String type;
    protected FuelType fuelType;

    public String start() {
        String startMethod = startMethod();
        if(engine) {
            return type + ": Engine STARTED by: " + startMethod;
        } else {
            return type + ": Engine cannot start because of not enough energy";
        }
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean validate(FuelType fuelType) {
        return this.fuelType == fuelType && internalValidation();
    }

    public abstract String startMethod();
    public abstract void setFuelStatus(int fuelStatus);
    public abstract boolean internalValidation();
}
