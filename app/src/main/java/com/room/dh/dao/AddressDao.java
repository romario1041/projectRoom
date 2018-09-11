package com.room.dh.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.room.dh.entity.Address;

@Dao
public interface AddressDao {

    @Insert
    void insert(Address address);

    @Update
    void update(Address address);

    @Delete
    void delete(Address address);

    @Query("SELECT * FROM address")
    Address[] loadall();
}
