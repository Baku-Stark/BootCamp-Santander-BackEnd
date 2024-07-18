package com.springboot_mysql.todo_list.repository;

import java.util.ArrayList;

public class TodoRepository {
    ArrayList<ArrayList<String>> todos = new ArrayList<>();

    public ArrayList<ArrayList<String>> getAllTodos(){
        return (todos.isEmpty()) ? null : todos;
    }

    public ArrayList<String> getTodoForID(int id){
        return (todos.isEmpty()) ? null : todos.get(id - 1);
    }

    public ArrayList<String> createTodo(String title, String description) {
        ArrayList<String> req = new ArrayList<>();
        req.add(title);
        req.add(description);

        System.out.println(req);

        todos.add(req);
        return req;
    }

    public ArrayList<String> deleteTodo(int id) {
        return (todos.isEmpty()) ? null : todos.remove(id - 1);

    }
}
