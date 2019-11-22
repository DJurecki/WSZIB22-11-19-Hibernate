package com.jurecki.dao;

import com.jurecki.model.CarHistory;

public interface ICarHistoryDAO {
    void persistCarHistory(CarHistory carHistory);
    CarHistory getCarById(int id);
}
