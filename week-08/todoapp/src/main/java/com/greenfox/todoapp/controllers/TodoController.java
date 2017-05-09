package com.greenfox.todoapp.controllers;


import com.greenfox.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

//  @RequestMapping(value = {"/", "/list"})
//  public String list(Model model) {
//    model.addAttribute("todolist", todoRepository.findAll());
//    return "/todo";
//  }

  @RequestMapping(value = {"/", "/list"})
  public String activeList(Model model,
          @RequestParam(value = "isActive", required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("todolist", todoRepository.findByIsDoneFalse());
    } else {
      model.addAttribute("todolist", todoRepository.findAll());
    }
    return "/todo";
  }

//  Greeting greeting(@RequestParam(value = "name", defaultValue = "World")String name)


}
