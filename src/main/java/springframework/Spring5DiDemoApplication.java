package springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springframework.controllers.ConstructorInjectedController;
import springframework.controllers.GetterInjectedController;
import springframework.controllers.MyController;
import springframework.controllers.PropertyInjectedController;

@SpringBootApplication
@ComponentScan(basePackages = {"springframework.services", "springframework"})
public class Spring5DiDemoApplication {

  public static void main(String[] args) {
    ApplicationContext cxt = SpringApplication.run(Spring5DiDemoApplication.class, args);

    MyController controller = (MyController) cxt.getBean("myController");

    System.out.println(controller.hello());
    System.out.println(cxt.getBean(PropertyInjectedController.class).sayHello());
    System.out.println(cxt.getBean(GetterInjectedController.class).sayHello());
    System.out.println(cxt.getBean(ConstructorInjectedController.class).sayHello());
  }

}
