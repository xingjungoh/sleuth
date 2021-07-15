package com.test.sleuth;

import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private static final Logger logger = Logger.getLogger(TestController.class.getName());

  @RequestMapping("/")
  public String home() {
    logger.info("Api triggered.");
    return "Hello World";
  }
}
