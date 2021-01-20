package com.gzeinnumer.mylibsqlitebuilderexample.activity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.mylibsqlitebuilderexample.DBInstance;
import com.gzeinnumer.mylibsqlitebuilderexample.databinding.ActivityTestBinding;
import com.gzeinnumer.mylibsqlitebuilderexample.table.Table1;

import java.util.List;

public class TestActivity extends AppCompatActivity {

    private static final String TAG = "TestActivity";

    private ActivityTestBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SQLiteDatabase database = DBInstance.getDataBase(getApplicationContext());

        DBInstance dbInstance = new DBInstance();

        binding.btnDeleteDb.setOnClickListener(view -> {
            boolean dbDeleted = dbInstance.delete();
            Log.d(TAG, "onCreate_11: " + dbDeleted);
        });
        binding.btnBackUpDb.setOnClickListener(view -> {
            boolean dbBackup = dbInstance.backUp(getApplicationContext());
            Log.d(TAG, "onCreate_12: " + dbBackup);
        });
        binding.btnDbRoot.setOnClickListener(view -> {
            boolean isExists = dbInstance.isDBExistOnRoot(getApplicationContext());
            Log.d(TAG, "onCreate_13: " + isExists);
        });
        binding.btnDbExternal.setOnClickListener(view -> {
            boolean isExists = dbInstance.isDBExist();
            Log.d(TAG, "onCreate_14: " + isExists);
        });
    }
}