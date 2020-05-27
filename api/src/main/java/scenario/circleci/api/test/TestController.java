package scenario.circleci.api.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/")
  public String index() {
    return "hello";
  }

  @GetMapping("/health")
  public boolean healthCheck() {
    return true;
  }
}
