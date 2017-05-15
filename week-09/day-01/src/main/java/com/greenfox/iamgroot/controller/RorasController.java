package com.greenfox.iamgroot.controller;


import com.greenfox.iamgroot.model.ErrorMessage;
import com.greenfox.iamgroot.model.ResponseMessage;
import com.greenfox.iamgroot.model.model.rora.Cargo;
import com.greenfox.iamgroot.model.model.rora.CargoFillReturn;
import com.greenfox.iamgroot.service.RoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RorasController {

  @Autowired
  RoraService roraService;

  @Autowired
  Cargo cargo;

  @Autowired
  CargoFillReturn cargoFillReturn;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ResponseMessage errormessage() {
    return new ErrorMessage("missing servlet request parameter exception");
  }

  @ExceptionHandler(Exception.class)
  public ResponseMessage errormessageUltimate() {
    return new ErrorMessage("unexpected error");
  }


  @RequestMapping(value = "/rocket", method = RequestMethod.GET)
  public ResponseMessage roraReport() {
    return new Cargo();
  }

  @RequestMapping(value = "/rocket/fill", method = RequestMethod.GET)
  public ResponseMessage roraFill(@RequestParam(value = "caliber", required = true) String caliber,
          @RequestParam(value = "amount", required = true) int amount) {
    if (caliber.equals(".25") || caliber.equals(".30") || caliber.equals(".50")) {
      roraService.fill(caliber, amount);
    }
    return cargoFillReturn;
  }
}