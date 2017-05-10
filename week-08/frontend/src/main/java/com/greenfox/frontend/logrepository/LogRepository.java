package com.greenfox.frontend.logrepository;


import com.greenfox.frontend.Entity.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface LogRepository extends CrudRepository <Log, Integer>{

}
