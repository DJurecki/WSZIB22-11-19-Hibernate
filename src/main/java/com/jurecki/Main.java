package com.jurecki;

import com.jurecki.configuration.AppConfiguration;
import com.jurecki.model.Car;
import com.jurecki.service.ICarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ICarService carService = context.getBean(ICarService.class);

        Car car = new Car(5, "Fiat", "A50", 2010);

        carService.saveCar(car);
    }
}
