package cz.kuci.abstracts;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarsMain {
    private static final List<Car> cars = Arrays.asList(new Tesla(), new Skoda120(), new OpelCorsa());

    public static void main(String[] args) {
        System.out.println("--- pokus o nastartovani motoru vsech aut. Zavolani metody start na CarImpl, ktera zavola metodu startMEthod na konkretni implementaci---");
        cars.stream().forEach(car->{
            System.out.println("Doplnujem energii do kary: " + car.getType());
            car.setFuelStatus(100);
            System.out.println("Startujeme");
            System.out.println(car.start());
            System.out.println("--------------------------------");
        });

        System.out.printf("---vypustim veskerou energii a provolam metodu start znovu---");
        cars.stream().forEach(car->{
            System.out.println("tohle auto je bez energie: " + car.getType());
            car.setFuelStatus(0);
            System.out.println("Startujeme");
            System.out.println(car.start());
            System.out.println("--------------------------------");
        });

        System.out.println("Ted najdeme v poli POUZE auta, ktera pouzivaji tekute palivo a maji dostatek paliva k jizde :)");
        //priprava dat
        cars.get(0).setFuelStatus(100);
        cars.get(1).setFuelStatus(20);
        cars.get(2).setFuelStatus(0);

        List<String> fuelOnlyCars = cars.stream()
                .filter(car->car.validate(FuelType.FUEL))
                .map(Car::getType)
                .collect(Collectors.toList());

        System.out.println(StringUtils.join(fuelOnlyCars, ", "));
    }
}
