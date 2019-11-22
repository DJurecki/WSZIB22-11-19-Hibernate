package com.jurecki.service.impl;

import com.jurecki.dao.ICarDAO;
import com.jurecki.dao.ICarHistoryDAO;
import com.jurecki.model.Car;
import com.jurecki.model.CarHistory;
import com.jurecki.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CarServiceImpl implements ICarService {

    @Autowired
    ICarDAO carDAO;
    @Autowired
    ICarHistoryDAO carHistoryDAO;

    public void saveCar(Car car){
        carDAO.persistCar(car);
        CarHistory carHistory = new CarHistory();
        carHistory.setDate(new Date());
        carHistory.setNewCarId(car.getId());
        carHistoryDAO.persistCarHistory(carHistory);
    }
}
