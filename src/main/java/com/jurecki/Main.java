package com.jurecki;

import com.jurecki.model.Car;
import com.jurecki.service.impl.CarServiceImpl;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5, "Audi", "A6", 2005);

        CarServiceImpl.saveCar(car);
       // CarRepository.persistCar(car);
       // Car car2 = CarRepository.getCarById(1);
        // System.out.println(car2);
/*
        List<Car> bmwCars = CarRepository.getAllBMWCars();
        System.out.println("LISTA");
        for(Car tempCar : bmwCars){
            System.out.println(tempCar);
        }
*/
    }
}
