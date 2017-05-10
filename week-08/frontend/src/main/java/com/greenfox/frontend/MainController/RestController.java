package com.greenfox.frontend.MainController;


import com.greenfox.frontend.Entity.Appenda;
import com.greenfox.frontend.Entity.DoUntil;
import com.greenfox.frontend.Entity.DoublingClass;
import com.greenfox.frontend.Entity.WelcomeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {


  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String handleMissingInput(MissingServletRequestParameterException e) {
    return "Error: missing input, input name> " + e.getParameterName();
  }

  @ExceptionHandler(Exception.class)
  public String handleError(Exception e) {
    return "General error, error message> " + e.getMessage();
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public DoublingClass doubling(@RequestParam(value = "valuetodouble") int amountToDouble) {
    DoublingClass newDouble = new DoublingClass(amountToDouble);
    return newDouble;
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public WelcomeMessage greeterForYou(@RequestParam(value = "name", required = true) String name,
          @RequestParam(value = "title", required = true) String title) {
    WelcomeMessage greeting = new WelcomeMessage(name, title);
    return greeting;
  }

  @RequestMapping(value = "appenda/{text}", method = RequestMethod.GET)
  public Appenda appenda(@PathVariable(value = "text", required = false) String textToAddA) {
    Appenda text = new Appenda(textToAddA);
    return text;
  }

  @RequestMapping(value = "dountil/{what}", method = RequestMethod.POST)
  public DoUntil doUntil(@PathVariable(value = "what", required = true) String whatTodo,
          @RequestBody DoUntil doUntil) {
    if (whatTodo.toLowerCase().equals("sum")) {
      doUntil.sumTheDountil();
    } else if (whatTodo.toLowerCase().equals("factor")) {
      doUntil.factorTheDountil();
    }
    return doUntil;
  }
}