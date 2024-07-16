package com.springboot_mysql.todo_list.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TodoController {
    @GetMapping("/get_all_todos")
    public String index() {
        return "Todo List";
    }
}
