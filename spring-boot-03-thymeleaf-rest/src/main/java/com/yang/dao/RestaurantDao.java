package com.yang.dao;

import com.yang.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {
    private static List<Guest> guests = new ArrayList<>();
    static {
        guests.add(new Guest("黄晓明","店长"));
        guests.add(new Guest("秦海璐","财务"));
        guests.add(new Guest("林述巍","主厨"));
        guests.add(new Guest("杨紫","前台"));
    }

    public List<Guest> query(){
        return guests;
    }
    public void toAdd(Guest guest){
        guests.add(guest);
    }
    public Guest select(String guestName){
        for (Guest guest : guests){
            if (guestName.equals(guest.getGuestName())){
                return guest;
            }
        }
        return new Guest("","");
    }
    public void update(Guest guest){
        for (Guest g :guests){
            if (g.getGuestName().equals(guest.getGuestName())){
                g.setRole(guest.getRole());
            }
        }
    }
    public void delete(String guestName){
        guests.remove(select(guestName));
    }
}
