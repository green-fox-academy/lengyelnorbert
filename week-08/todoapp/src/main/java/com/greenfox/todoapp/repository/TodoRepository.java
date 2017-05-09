package com.greenfox.todoapp.repository;


import com.greenfox.todoapp.Entity.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findByIsDoneTrue();

  List<Todo> findByIsDoneFalse();

}
