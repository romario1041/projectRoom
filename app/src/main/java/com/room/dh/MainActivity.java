package com.room.dh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.room.dh.database.AppDataBase;
import com.room.dh.util.DataGenerator;
import com.room.dh.util.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDataBase dataBase = AppDataBase.getAppDatabase(MainActivity.this);
        DataGenerator.with(dataBase).generatePeople();
        DataGenerator.with(dataBase).generateCats();

        Logger.displayCatsInLog(dataBase.catDao().loadAll());
        Logger.displayPersonsInLog(dataBase.personDao().loadAll());
    }
}
