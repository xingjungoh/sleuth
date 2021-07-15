package com.test.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TestSleuthApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestSleuthApplication.class);
  }
}
