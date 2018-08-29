package com.study.bestteam.youstudy.DataBase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = Department.class, parentColumns = "id", childColumns = "department_id", onDelete = CASCADE))
public class Group {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "department_id")
    public int departmentId;

    @ColumnInfo(name = "year_of_admission")
    public int yearOfAdmission;

    public int number;

}
