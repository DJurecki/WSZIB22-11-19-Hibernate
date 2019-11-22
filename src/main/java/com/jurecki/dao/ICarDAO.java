package com.jurecki.dao;

import com.jurecki.model.Car;

public interface ICarDAO {
    void persistCar(Car car);
    Car getCarById(int id);
    void updateCar(Car car);
}
