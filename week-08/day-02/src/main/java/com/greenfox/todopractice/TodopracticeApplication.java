package com.greenfox.todopractice;

import com.greenfox.todopractice.Entity.Todo;
import com.greenfox.todopractice.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodopracticeApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodopracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepository.save(new Todo("I have even more Object Relational Mapping to learn"));
  }
}
