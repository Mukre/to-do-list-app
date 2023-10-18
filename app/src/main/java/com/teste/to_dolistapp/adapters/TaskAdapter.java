package com.teste.to_dolistapp.adapters;


import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.teste.to_dolistapp.R;
import com.teste.to_dolistapp.holders.TaskHolder;
import com.teste.to_dolistapp.models.Task;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskHolder>{
    private List<Task> taskList;

    public TaskAdapter(List<Task> taskList) {
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public TaskHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TaskHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_layout, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull TaskHolder holder, int position) {
        holder.task.setText(taskList.get(position).getTaskName());


    }

    @Override
    public int getItemCount() {
        return taskList != null ? taskList.size() : 0;
    }

    public void addTask(Task task){
        taskList.add(0, task);
        notifyItemInserted(0);
    }

    public void removeTask(Task task){
        int position = taskList.indexOf(task);
        taskList.remove(position);
        notifyItemRemoved(position);
    }

    public Activity getActivity(View v){
        Context ctx = v.getContext();
        while (ctx instanceof ContextWrapper){
            if (ctx instanceof Activity)
                return (Activity) ctx;

            ctx = ((ContextWrapper)ctx).getBaseContext();
        }
        return null;
    }
}
