package com.gzeinnumer.mylibsqlitebuilderexample.table;

import com.gzeinnumer.sb.struct.CreateTableQuery;

@CreateTableQuery(query = "CREATE TABLE table3 (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, id_table1 INTEGER)")
public class Table3 {

    private int id;
    private String name;
    private int id_table1;

    private final String KEY_ID = "id";
    private final String KEY_NAME = "name";
    private final String KEY_ID_TABLE1 = "id_table1";

    //constructor
    //getter setter
}
