package com.gzeinnumer.mylibsqlitebuilderexample.table;

import com.gzeinnumer.sb.struct.CreateTableQuery;

@CreateTableQuery(query = "CREATE TABLE table1 (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, rating REAL, descr TEXT, flag_active INTEGER, created_at TEXT)")
public class Table1 {
    private int id;
    private String name;
    private double rating;
    private String desc;
    private int flag_active;
    private String created_at;

    private final String KEY_ID = "";
    private final String KEY_NAME = "name";
    private final String KEY_RATING = "rating";
    private final String KEY_DESC = "desc";
    private final String KEY_FLAG_ACTIVE = "flag_active";
    private final String KEY_CRATED_AT = "created_at";

    //constructor
    //getter setter
}
