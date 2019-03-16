package com.engmomenali.todolist.vm;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.engmomenali.todolist.database.AppDataBase;
import com.engmomenali.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {
    private LiveData<TaskEntry> task;

    public AddTaskViewModel(AppDataBase dataBase,int taskID) {
        task = dataBase.taskDao().loadTaskByID(taskID);
    }

    public LiveData<TaskEntry> getTask() {
        return task;
    }
}
