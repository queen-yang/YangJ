package com.yang.service;

import com.yang.bean.Guest;
import com.yang.dao.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImp implements RestaurantService{

    @Autowired
    private RestaurantDao dao;

    public List<Guest> query(){
        return dao.query();
    }

    @Override
    public void add(Guest guest) {
        dao.toAdd(guest);
    }

    @Override
    public Guest select(String guestName) {
        return dao.select(guestName);
    }

    @Override
    public void update(Guest guest) {
        dao.update(guest);
    }

    @Override
    public void delete(String guestName) {
            dao.delete(guestName);
    }
}
