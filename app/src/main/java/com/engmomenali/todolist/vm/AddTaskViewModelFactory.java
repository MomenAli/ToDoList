package com.engmomenali.todolist.vm;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.engmomenali.todolist.database.AppDataBase;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final AppDataBase mDB;
    private final int mTaskID;

    public AddTaskViewModelFactory(AppDataBase mDB, int mTaskID) {
        this.mDB = mDB;
        this.mTaskID = mTaskID;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new AddTaskViewModel(mDB,mTaskID);
    }
}
