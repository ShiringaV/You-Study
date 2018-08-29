package com.study.bestteam.youstudy.DataBase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Institut {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "institute_name")
    public String instituteName;

    public String description;

}
