package com.poja.demo.endpoint.rest.controller.health;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldControllerTest {

  @Test
  void helloWorld() {
    assertEquals("Hello World!", new HelloWorldController().helloWorld());
  }
}
