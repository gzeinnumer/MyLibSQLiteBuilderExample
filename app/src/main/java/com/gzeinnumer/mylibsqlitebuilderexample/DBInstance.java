package com.gzeinnumer.mylibsqlitebuilderexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

import com.gzeinnumer.mylibsqlitebuilderexample.table.Table1;
import com.gzeinnumer.mylibsqlitebuilderexample.table.Table2;
import com.gzeinnumer.mylibsqlitebuilderexample.table.Table3;
import com.gzeinnumer.sb.SQLiteBuilder;
import com.gzeinnumer.sb.struct.SQLiteDatabaseEntity;

@SQLiteDatabaseEntity(entities = {
        Table1.class,
        Table2.class,
        Table3.class
})
public class DBInstance extends SQLiteBuilder {
    private static final String TAG = "DBInstance_";

    private static SQLiteDatabase sqLiteDatabase;
    public static String DB_PATH_EXTERNAL = Environment.getExternalStorageDirectory().toString() + "/MyLibSQLiteBuilderExternal/MyLibSQLiteSimple.db";
    public static String DB_PATH_BC = Environment.getExternalStorageDirectory().toString() + "/MyLibSQLiteBuilderBC/MyLibSQLiteSimple.db";
    public static String DB_NAME = "MyLibSQLiteSimple.db";

    public static SQLiteDatabase getDataBase(Context context) {
        sqLiteDatabase = SQLiteBuilder.builder(DBInstance.class, context)
                .setDatabaseName(DB_NAME)
                .setDatabaseVersion(1)
                .putDatabaseToExternal(DB_PATH_BC)
//                .loadDatabaseFromExternal(DB_PATH_EXTERNAL)
                .build();
        return sqLiteDatabase;
    }

    public boolean delete() {
        return deleteDatabase(DB_PATH_BC);
    }

    public boolean deleteRootDb(Context context) {
        return deleteDatabaseOnRoot(context, DB_NAME);
    }

    public boolean backUp(Context context) {
        String BACK_UP_TO = Environment.getExternalStorageDirectory().toString() + "/MyLibSQLiteBuilderExternalBackUp";
        return backUpDatabase(context, BACK_UP_TO, DB_NAME);
    }

    public boolean isDBExist(){
        return isDatabaseExists(DB_PATH_BC);
    }

    public boolean isDBExistOnRoot(Context context){
        return isDatabaseExistOnRoot(context, DB_NAME);
    }
}
