package com.greenfox.frontend.MainController;


import com.greenfox.frontend.Entity.Appenda;
import com.greenfox.frontend.Entity.Array;
import com.greenfox.frontend.Entity.ArrayToReturn;
import com.greenfox.frontend.Entity.ArrayToReturn2;
import com.greenfox.frontend.Entity.DoUntil;
import com.greenfox.frontend.Entity.DoublingClass;
import com.greenfox.frontend.Entity.GeneralReturnArray;
import com.greenfox.frontend.Entity.Log;
import com.greenfox.frontend.Entity.WelcomeMessage;
import com.greenfox.frontend.logrepository.LogRepository;
import java.util.Arrays;
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

  @Autowired
  LogRepository logRepo;


  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String handleMissingInput(MissingServletRequestParameterException e) {
    return "Error: missing input, input name> " + e.getParameterName();
  }

  @ExceptionHandler(Exception.class)
  public String handleError(Exception e) {
    return "General error, error message> " + e.getMessage();
  }

  @RequestMapping(value = "doubling", method = RequestMethod.GET)
  public DoublingClass doubling(@RequestParam(value = "valuetodouble") int amountToDouble) {
    DoublingClass newDouble = new DoublingClass(amountToDouble);
    logRepo.save(new Log("doubling", String.valueOf(amountToDouble)));
    return newDouble;
  }

  @RequestMapping(value = "greeter", method = RequestMethod.GET)
  public WelcomeMessage greeterForYou(@RequestParam(value = "name", required = true) String name,
          @RequestParam(value = "title", required = true) String title) {
    WelcomeMessage greeting = new WelcomeMessage(name, title);
    logRepo.save(new Log("greeter", name + "/" + title));
    return greeting;
  }

  @RequestMapping(value = "appenda/{text}", method = RequestMethod.GET)
  public Appenda appenda(@PathVariable(value = "text", required = false) String textToAddA) {
    Appenda text = new Appenda(textToAddA);
    logRepo.save(new Log("appenda/" + textToAddA, ""));
    return text;
  }

  @RequestMapping(value = "dountil/{what}", method = RequestMethod.POST)
  public DoUntil dountil(@PathVariable(value = "what", required = true) String whatTodo,
          @RequestBody DoUntil doUntil) {
    if (whatTodo.toLowerCase().equals("sum")) {
      doUntil.sumTheDountil();
    } else if (whatTodo.toLowerCase().equals("factor")) {
      doUntil.factorTheDountil();
    }
    logRepo.save(new Log("dountil/" + whatTodo, String.valueOf(doUntil.getUntil())));
    return doUntil;
  }

  @RequestMapping(value = "arrays", method = RequestMethod.POST)
  public GeneralReturnArray arrayToReturn(@RequestBody Array array) {
    ArrayToReturn arrayToReturn = new ArrayToReturn();
    if (array.getWhat().toLowerCase().equals("sum")) {
      array.sumArrayElements();
      arrayToReturn = new ArrayToReturn(array.getResult());
      logRepo.save(new Log("arrays/",
              array.getWhat().toLowerCase() + "/" + Arrays.toString(array.getNumbers())));
    } else if (array.getWhat().toLowerCase().equals("multiply")) {
      array.multiplyArrayElements();
      arrayToReturn = new ArrayToReturn(array.getResult());
      logRepo.save(new Log("arrays/",
              array.getWhat().toLowerCase() + "/" + Arrays.toString(array.getNumbers())));
    } else if (array.getWhat().toLowerCase().equals("double")) {
      array.doubleElement();
      ArrayToReturn2 arrayToReturn2 = new ArrayToReturn2(array.getResultNumbers());
      logRepo.save(new Log("arrays/",
              array.getWhat().toLowerCase() + "/" + Arrays.toString(array.getNumbers())));
      return arrayToReturn2;
    }
    return arrayToReturn;
  }
}
