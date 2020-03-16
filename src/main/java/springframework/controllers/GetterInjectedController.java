package springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springframework.services.GreetingService;

@Controller
public class GetterInjectedController {
  private GreetingService greetingService;
//@Qualifier("getterGreetingService")
  @Autowired
  public void setGreetingService( GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
