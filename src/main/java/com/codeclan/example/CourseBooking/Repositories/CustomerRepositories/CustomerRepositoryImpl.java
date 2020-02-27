package com.codeclan.example.CourseBooking.Repositories.CustomerRepositories;

import com.codeclan.example.CourseBooking.Models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

public class CustomerRepositoryImpl {

//    @Autowired
//    EntityManager entityManager;
//
//    @Transactional
//    public List<Customer> findShipsThatHavePiratesNamed(String firstName){
//        List<Ship> result = null;
//        Session session = entityManager.unwrap(Session.class);
//        try{
//            Criteria cr = session.createCriteria(Ship.class);
//            cr.createAlias("pirates", "pirateAlias");
//            cr.add(Restrictions.eq("pirateAlias.firstName", firstName));
//            result = cr.list();
//        }
//        catch (HibernateException ex){
//            ex.printStackTrace();;
//        }
//        return result;
//    }
}
