package com.poja.demo.endpoint.arit.service;

import org.springframework.stereotype.Service;

@Service
public class AritService {
  private void validate(Integer a, Integer b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException("A and B cannot be null");
    }
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("A and B cannot be negative");
    }
  }

  public int sum(Integer a, Integer b) {
    validate(a, b);
    return (a + b);
  }

  public int soustraction(Integer a, Integer b) {
    validate(a, b);
    return (a - b);
  }

  public int multiplication(Integer a, Integer b) {
    validate(a, b);
    return (a * b);
  }

  public int division(Integer a, Integer b) {
    if (b == 0) {
      throw new IllegalArgumentException("Division by zero not allowed");
    }
    validate(a, b);
    return (a / b);
  }
}
