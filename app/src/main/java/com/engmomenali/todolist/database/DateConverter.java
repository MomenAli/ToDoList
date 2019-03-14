package com.engmomenali.todolist.database;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

public class DateConverter {
    @TypeConverter
    public static Date toDate(Long timesTamp){
        return timesTamp == null ? null : new Date(timesTamp);
    }

    @TypeConverter
    public static Long toTimesTamp(Date date){
        return date == null ? null : date.getTime();
    }
}
