package com.gzeinnumer.mylibsqlitebuilderexample.table;


import com.gzeinnumer.mylibsqlitebuilder.struct.CreateTableQuery;

@CreateTableQuery
public class Table1 {
    private int id;
    private String name;
    private double rating;
    private String desc;
    private int flag_active;
    private String created_at;

    private String KEY_ID = "";
    private String KEY_NAME = "name";
    private String KEY_RATING = "rating";
    private String KEY_DESC = "desc";
    private String KEY_FLAG_ACTIVE = "flag_active";
    private String KEY_CRATED_AT = "created_at";

    //constructor
    //getter setter
}