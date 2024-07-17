package com.springboot_mysql.todo_list.controllers;

import com.springboot_mysql.todo_list.repository.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping
public class TodoController {
    TodoRepository todoRepository = new TodoRepository();

    @GetMapping("/get_all_todos")
    public ArrayList<ArrayList<String>> index() {
        return todoRepository.getAllTodos();
    }

    @GetMapping("/get_id_todo/{id}")
    public ArrayList<String> get_id_todo(@PathVariable int id) {
        return todoRepository.getTodoForID(id);
    }

    @PostMapping("/create_todo")
    public ArrayList<String> createTodo(String title, String description) {
        //System.out.println("Title: " + title + ", Description: " + description);
        return todoRepository.createTodo(title, description);
    }
}
