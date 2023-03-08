package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> citylist = new ArrayList<>();

    @Test
    public void testAddcity() {
        CustomList list = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(1, list.getCount());
    }


 @Test
    public void testHasCity(City city){
        CustomList list = new CustomList(null, citylist);
        City city2 = new City("Calgary", "AB");
        Boolean contain;
        contain = list.hasCity(city2);
//        for(int i = 0 ; i < list.getCount(); i++){
//            contain = citylist.get(i).getCityName().equals(city2.getCityName());
//            if(contain){
//                assertTrue(contain);
//            }
//        }

        assertTrue(contain);
    }
}