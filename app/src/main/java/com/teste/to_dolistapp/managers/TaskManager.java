package com.teste.to_dolistapp.managers;

import com.teste.to_dolistapp.models.Task;

import java.util.List;

public class TaskManager {

    public static List<Task> getAllTasks() {
        return Task.listAll(Task.class);
    }

    public static Task getTaskById(long id) {
        return Task.findById(Task.class, id);
    }

    public static void addTask(Task task) {
        task.save();
    }

    public static void updateTask(Task task) {
        task.save();
    }

    public static void deleteTask(Task task) {
        task.delete();
    }
}

