package com.greenfox.todoapp.controllers;


import com.greenfox.todoapp.Entity.Todo;
import com.greenfox.todoapp.repository.TodoRepository;
import javax.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"", "/", "/list"})
  public String activeList(Model model,
          @RequestParam(value = "isActive", required = false) Boolean isActivehere) {
    model.addAttribute("todoListSize", todoRepository.count());
    if (isActivehere == null) {
      model.addAttribute("todolist", todoRepository.findAll());
    } else if (isActivehere) {
      model.addAttribute("todolist", todoRepository.findByIsDoneFalse());
    } else {
      model.addAttribute("todolist", todoRepository.findByIsDoneTrue());
    }
    return "/todo";
  }

  @GetMapping(value = {"addtodo"})
  public String addtodo(Model model) {
    return "/addtodo";
  }

  @RequestMapping(value = "/add", method = RequestMethod.GET)
  public String add(@RequestParam(value = "todoText") String newTodoText) {
    todoRepository.save(new Todo(newTodoText));
    return "redirect:/todo/";
  }

  @RequestMapping(value = "/{id}/removetodo", method = RequestMethod.GET)
  public String remove(@PathVariable("id") Integer removeID) {
    System.out.println(removeID);
    todoRepository.delete(removeID);
    return "redirect:/todo/";
  }
}
