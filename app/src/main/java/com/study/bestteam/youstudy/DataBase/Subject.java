package com.study.bestteam.youstudy.DataBase;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Subject {

    @PrimaryKey
    public int id;

    public String name;

    public String description;

}
