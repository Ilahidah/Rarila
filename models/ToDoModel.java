package com.example.testchat.models;

public class ToDoModel extends com.example.testchat.models.TaskId {

    private String task, due;
    private int status;

    public String getTask(){
        return task;
    }

    public String getDue(){
        return due;
    }

    public int getStatus(){
        return status;
    }
}
