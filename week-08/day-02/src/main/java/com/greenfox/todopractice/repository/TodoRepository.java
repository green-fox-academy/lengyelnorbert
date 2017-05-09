package com.greenfox.todopractice.repository;


import com.greenfox.todopractice.Entity.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
