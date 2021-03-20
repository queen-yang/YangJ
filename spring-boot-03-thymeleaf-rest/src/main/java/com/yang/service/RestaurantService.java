package com.yang.service;

import com.yang.bean.Guest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantService {
    List<Guest> query();
    void add(Guest guest);
    Guest select(String guestName);
    void update(Guest guest);
    void delete(String guestName);
}
