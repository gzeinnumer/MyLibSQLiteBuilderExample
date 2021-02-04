package com.gzeinnumer.mylibsqlitebuilderexample.activity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.mylibsqlitebuilderexample.DBInstance;
import com.gzeinnumer.mylibsqlitebuilderexample.databinding.ActivityTestBinding;

public class TestActivity extends AppCompatActivity {

    private static final String TAG = "TestActivity";

    private ActivityTestBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //connection to database
        SQLiteDatabase database = DBInstance.getDataBase(getApplicationContext());

        DBInstance dbInstance = new DBInstance();

        binding.btnCreateDb.setOnClickListener(view -> {
            DBInstance.getDataBase(getApplicationContext());
        });
        binding.btnDeleteDb.setOnClickListener(view -> {
            boolean dbDeleted = dbInstance.delete();
            Toast.makeText(this, "Database Delete in folder MyLibSQLiteBuilderExternal : " + dbDeleted, Toast.LENGTH_SHORT).show();
        });
        binding.btnBackUpDb.setOnClickListener(view -> {
            boolean dbBackup = dbInstance.backUp(getApplicationContext());
            Toast.makeText(this, "Database Backup to folder MyLibSQLiteBuilderExternalBackUp : " + dbBackup, Toast.LENGTH_SHORT).show();
        });
        binding.btnDbRoot.setOnClickListener(view -> {
            boolean isExists = dbInstance.isDBExistOnRoot(getApplicationContext());
            Toast.makeText(this, "Database Created on ROOT : " + isExists, Toast.LENGTH_SHORT).show();
        });
        binding.btnDbExternal.setOnClickListener(view -> {
            boolean isExists = dbInstance.isDBExist();
            Toast.makeText(this, "Database Created on MyLibSQLiteBuilderExternal : " + isExists, Toast.LENGTH_SHORT).show();
        });
    }
}