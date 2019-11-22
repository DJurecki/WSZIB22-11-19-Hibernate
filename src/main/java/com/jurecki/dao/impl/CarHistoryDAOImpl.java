package com.jurecki.dao.impl;

import com.jurecki.dao.ICarHistoryDAO;
import com.jurecki.model.CarHistory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CarHistoryDAOImpl implements ICarHistoryDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void persistCarHistory(CarHistory carHistory){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(carHistory);
            tx.commit();
        } catch (HibernateException e){
            if(tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }

    public CarHistory getCarById(int id){
        Session session = factory.openSession();
        CarHistory carHistory = (CarHistory) session.createQuery("FROM com.jurecki.model.Car WHERE id = " + id).uniqueResult();
        session.close();
        return carHistory;
    }
}
