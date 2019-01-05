package cz.kuci.abstracts;

public interface Car {
    String start();
    String startMethod();
    String getType();
    boolean validate(FuelType fuelType);
    void setFuelStatus(int fuelStatus);
}
