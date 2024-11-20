package org.xworkz.playstores.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.xworkz.playstores.dto.AppDto;

public class AppDaoImpl implements AppDao{
    @Override
    public void addApp(AppDto appDto) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(AppDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(appDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public AppDto getAppById(int id) {
            Configuration configuration = new Configuration();
            configuration.configure();
            configuration.addAnnotatedClass(AppDto.class);
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            AppDto appDto = session.get(AppDto.class, id);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        return appDto;
    }

    @Override
    public AppDto updateDownloadSizeById(String UpdatedSize, int id) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(AppDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        AppDto appDto = session.get(AppDto.class,id);
        appDto.setDownloadSize(UpdatedSize);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return appDto;
    }

    @Override
    public void removeApp(int id) {

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(AppDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        AppDto appDto = session.get(AppDto.class,id);
        session.remove(appDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
