package com.room.dh.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.room.dh.entity.Cat;
import com.room.dh.entity.Person;

@Dao
public interface PersonDao {

    @Insert
    void insert(Person[] person);

    @Update
    void update(Person person);

    @Delete
    void delete(Person person);

    @Query("SELECT * FROM person")
    Person[] loadAll();
}
