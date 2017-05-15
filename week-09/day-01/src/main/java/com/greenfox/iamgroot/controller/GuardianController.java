package com.greenfox.iamgroot.controller;


import com.greenfox.iamgroot.model.ErrorMessage;
import com.greenfox.iamgroot.model.Message;
import com.greenfox.iamgroot.model.ResponseMessage;
import com.greenfox.iamgroot.model.Yondu;
import java.util.InputMismatchException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GuardianController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ResponseMessage errormessage() {
    return new ErrorMessage("missing servlet request parameter exception");
  }

  @ExceptionHandler(Exception.class)
  public ResponseMessage errormessageUltimate() {
    return new ErrorMessage();
  }

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public ResponseMessage responseMessage(@RequestParam(value = "message") String received) {
    if (received.equals("")) {
      return new ErrorMessage("I am Groot!");
    } else {
      return new Message(received);
    }
  }

  @RequestMapping(value = "yondu", method = RequestMethod.GET)
  public ResponseMessage yonduMessage(@RequestParam(value = "distance") int distance,
          @RequestParam(value = "time") int time) {
    try {
      int Xdist = distance;
      int Xtime = time;
    } catch (InputMismatchException exception) {
      return new ErrorMessage("input is not an integer " + exception);
    }
    if (time == 0) {
      return new ErrorMessage("we cannot divide by zero");
    } else {
      return new Yondu(distance, time);
    }
  }
}
