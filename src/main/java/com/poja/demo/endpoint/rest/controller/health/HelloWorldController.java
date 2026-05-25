package com.poja.demo.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorldController {
  @GetMapping("/hello")
  public String helloWorld() {
    return "Hello World!";
  }
}
