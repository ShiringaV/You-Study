package com.study.bestteam.youstudy.DataBase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class News {

    @PrimaryKey
    public long id;

    public String header;

    public String description;

    @ColumnInfo(name = "url_img")
    public String urlImg;

}
