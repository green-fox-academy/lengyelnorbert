package com.greenfox.iamgroot.controller;


import com.greenfox.iamgroot.model.ErrorMessage;
import com.greenfox.iamgroot.model.ResponseMessage;
import com.greenfox.iamgroot.service.DraxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DraxController {

  @Autowired
  DraxService draxService;


  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ResponseMessage errormessage() {
    return new ErrorMessage("missing servlet request parameter exception");
  }

  @ExceptionHandler(Exception.class)
  public ResponseMessage errormessageUltimate() {
    return new ErrorMessage("unexpected error");
  }


  @RequestMapping(value = "/drax", method = RequestMethod.GET)
  public ResponseMessage draxReport() {
    return draxService.getCalorieTable();
  }
}
