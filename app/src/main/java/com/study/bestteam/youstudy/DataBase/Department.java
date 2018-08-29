package com.study.bestteam.youstudy.DataBase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Department {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "full_name")
    public String fullName;

    @ColumnInfo(name = "short_name")
    public String shortName;

    public String description;

}


