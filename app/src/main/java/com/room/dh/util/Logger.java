package com.room.dh.util;

import android.util.Log;

import com.room.dh.entity.Address;
import com.room.dh.entity.Cat;
import com.room.dh.entity.Person;

public class Logger {


    private static final String TAG = Logger.class.getName();


    public static void displayAdressesInLog(Address[] addresses) {

        if (addresses == null)
            return;

        for (Address address: addresses) {
            Log.d(TAG, "Address street: " + address.state + ", address city: " + address.city + ", address state: " + address.state + ", adress postal code: " + address.postCode);
        }
    }


    public static void displayPersonsInLog(Person[] persons) {

        if (persons == null)
            return;

        for (Person person: persons) {
            Log.d(TAG, "Person id: " + person.id + ", person name: " + person.firstName + " " + person.lastName);
        }
    }


    public static void displayCatsInLog(Cat[] cats) {

        if (cats == null)
            return;

        for (Cat cat: cats) {
            Log.d(TAG, "Cat id: " + cat.id + ", cat name: " + cat.name + ", cat age: " + cat.age + ", cat owner: " + cat.hoomanId);
        }
    }
}
