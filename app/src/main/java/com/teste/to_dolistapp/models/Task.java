package com.teste.to_dolistapp.models;

import com.orm.SugarRecord;

public class Task extends SugarRecord {
    private String taskName;
    private boolean isDone;

    public Task(String taskName, boolean isDone) {
        this.taskName = taskName;
        this.isDone = isDone;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isDone() {
        return isDone;
    }
}
