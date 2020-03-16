package springframework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
  @Override
  public String getEnglishGreeting() {
    return "Hello English";
  }

  @Override
  public String getSpanishGreeting() {
    return "OLa Spanish";
  }

  @Override
  public String getGermanGreeting() {
    return "Guten tag";
  }
}
