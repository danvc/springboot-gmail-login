package com.sample.dao.impl;

import com.sample.dao.UserDao;
import com.sample.entity.SampleUser;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl extends GenericDaoImpl<Integer, SampleUser> implements UserDao {


    @Override
    public int delete(Class className, int id) {
        System.out.println("UserDaoImpl.delete");
        return getSession().createQuery("delete "+className.getName()+" where userId = :userId").setParameter("userId",id).executeUpdate();
    }
}
