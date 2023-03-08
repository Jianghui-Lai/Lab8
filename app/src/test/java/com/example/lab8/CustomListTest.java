package com.example.lab8;


import static org.junit.Assert.assertFalse;
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
    public void testHasCity(){
        CustomList list = new CustomList(null, citylist);
        City city2 = new City("Calgary", "AB");
        list.addCity(city2);
        //list.hasCity(city2);
        assertTrue(list.hasCity(city2));
    }


 @Test
    public void testDeleteCity(){
     CustomList list = new CustomList(null, citylist);
     City city2 = new City("Calgary", "AB");
     list.addCity(city2);
     list.deleteCity(city2);
     assertFalse(list.hasCity(city2));


 }

@Test
 public void countCity(){
     CustomList list = new CustomList(null, citylist);
     City city2 = new City("Calgary", "AB");
     list.addCity(city2);
     assertEquals(list.countCities() , list.getCount());

 }
}

