package com.xworkz.productapp.dao;

import com.xworkz.productapp.dto.ProductDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EcommerceDaoImpl implements EcommerceDao {

    @Override
    public void addProducts(ProductDto productDto)  {

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(ProductDto.class);
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(productDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public ProductDto getProducyById(int id) {
        Configuration configuration1 = new Configuration();
        configuration1.configure();
        configuration1.addAnnotatedClass(ProductDto.class);
        SessionFactory sessionFactory1 = configuration1.buildSessionFactory();
        Session session1 = sessionFactory1.openSession();
        session1.beginTransaction();
        ProductDto productDto = session1.get(ProductDto.class,id);
        session1.getTransaction().commit();
        session1.close();
        sessionFactory1.close();
        return productDto;
    }

    @Override
    public ProductDto updateNameById(int existingId, String name) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(ProductDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        ProductDto productDto = session.get(ProductDto.class ,existingId);
        productDto.setName(name);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return productDto;
    }

    @Override
    public void deleteDetailsByName(int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(ProductDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        ProductDto productDto = session.get(ProductDto.class,id);
        if(productDto != null)
            session.remove(productDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

}
