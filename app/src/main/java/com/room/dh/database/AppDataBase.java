package com.room.dh.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.room.dh.dao.AddressDao;
import com.room.dh.dao.CatDao;
import com.room.dh.dao.PersonDao;
import com.room.dh.entity.Address;
import com.room.dh.entity.Cat;
import com.room.dh.entity.Person;

@Database(entities = {Person.class, Address.class, Cat.class},version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    private static AppDataBase instance;
    public abstract CatDao catDao();
    public abstract PersonDao personDao();
    public abstract AddressDao addressDao();

    public static AppDataBase getAppDatabase(Context context) {

        if(instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
            AppDataBase.class,
            "cat-owners-db").allowMainThreadQueries().build();
        }
        return  instance;
    }
}
