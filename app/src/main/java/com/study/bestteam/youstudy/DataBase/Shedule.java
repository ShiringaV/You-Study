package com.study.bestteam.youstudy.DataBase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = {@ForeignKey(entity = Subject.class, parentColumns = "id", childColumns = "subject_id", onDelete = CASCADE),
        @ForeignKey(entity = Lecturer.class, parentColumns = "id", childColumns = "lecturer_id", onDelete = CASCADE),
        @ForeignKey(entity = Department.class, parentColumns = "id", childColumns = "department_id", onDelete = CASCADE),
        @ForeignKey(entity = Group.class, parentColumns = "id", childColumns = "group_id", onDelete = CASCADE)})
public class Shedule {

    @PrimaryKey
    public long id;

    @ColumnInfo(name = "subject_id")
    public int subjectId;

    @ColumnInfo(name = "lecturer_id")
    public int lecturerId;

    @ColumnInfo(name = "department_id")
    public int departmentId;

    @ColumnInfo(name = "group_id")
    public int groupId;

    public String classroom;

    @ColumnInfo(name = "lesson_number")
    public int lessonNumber;

    @ColumnInfo(name = "day_of_week")
    public String dayOfWeek;

    public int week;

}
