package com.teste.to_dolistapp.holders;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.teste.to_dolistapp.R;

public class TaskHolder extends RecyclerView.ViewHolder {
    public TextView task;
    public CheckBox done;
    public TaskHolder(@NonNull View itemView) {
        super(itemView);
        task = itemView.findViewById(R.id.task_name);
        done = itemView.findViewById(R.id.task_done);
    }
}
