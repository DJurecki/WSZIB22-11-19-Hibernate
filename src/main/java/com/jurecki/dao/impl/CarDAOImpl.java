package com.jurecki.dao.impl;

import com.jurecki.dao.ICarDAO;
import com.jurecki.model.Car;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CarDAOImpl implements ICarDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void persistCar(Car car){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(car);
            tx.commit();
        } catch (HibernateException e){
            if(tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }

    public Car getCarById(int id){
        Session session = factory.openSession();
        Car cars = (Car) session.createQuery("FROM com.jurecki.model.Car WHERE id = " + id).uniqueResult();
        session.close();
        return cars;
    }

    @Override
    public void updateCar(Car car) {
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.update(car);
            tx.commit();
        } catch (HibernateException e){
            if(tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }

    /*
    public static List<Car> getAllBMWCars(){
        Session session = factory.openSession();
        List<Car> bmwCars = session.createQuery("FROM com.jurecki.model.Car WHERE brand = 'BMW'").list();
        return bmwCars;
    }*/
}
