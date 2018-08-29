package com.study.bestteam.youstudy.DataBase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = {@ForeignKey(entity = Lecturer.class, parentColumns = "id", childColumns = "lecturer_id", onDelete = CASCADE),
        @ForeignKey(entity = Department.class, parentColumns = "id", childColumns = "department_id", onDelete = CASCADE)})
public class LecturerInfo {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "lecturer_id")
    public int lecturerId;

    @ColumnInfo(name = "department_id")
    public int departmentId;

}
