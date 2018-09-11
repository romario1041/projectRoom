package com.room.dh.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.room.dh.entity.Address;
import com.room.dh.entity.Cat;

@Dao
public interface CatDao {

    @Insert
    void insert(Cat[] cat);

    @Update
    void update(Cat cat);

    @Delete
    void delete(Cat cat);

    @Query("SELECT * FROM cat")
    Cat[] loadAll();
}
