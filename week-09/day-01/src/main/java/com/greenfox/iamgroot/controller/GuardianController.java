package com.greenfox.iamgroot.controller;


import com.greenfox.iamgroot.model.ErrorMessage;
import com.greenfox.iamgroot.model.Message;
import com.greenfox.iamgroot.model.ResponseMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ResponseMessage errormessage() {
    return new ErrorMessage();
  }

  @RequestMapping(value = "/groot",  method = RequestMethod.GET)
  public ResponseMessage responseMessage(@RequestParam(value = "message") String received) {
    if (received.equals("")){
      return new ErrorMessage();
    }
    return new Message(received);
  }
}