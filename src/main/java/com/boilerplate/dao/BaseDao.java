package com.boilerplate.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * Created by ratikesh on 1/8/16.
 */
@Service
public class BaseDao implements CrudRepository{

    @Autowired
    EntityManager entityManager;

    private Session session;

    public static ThreadLocal<Session> currentSession=new ThreadLocal<Session>();


    public Session getCurrentSession() {
        return entityManager.unwrap(Session.class);

    }

    public void closeSession() {
        session.close();
    }

    @Override
    public Object save(Object o) {
        Long updatedEntity = (Long)getCurrentSession().save(o);
        return updatedEntity;
    }

    @Override
    public Iterable save(Iterable iterable) {
        return null;
    }

    @Override
    public Object findOne(Serializable serializable) {
        return null;
    }

    @Override
    public boolean exists(Serializable serializable) {
        return false;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Iterable findAll(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Serializable serializable) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void delete(Iterable iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
