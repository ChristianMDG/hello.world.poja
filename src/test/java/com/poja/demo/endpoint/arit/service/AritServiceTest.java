package com.poja.demo.endpoint.arit.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AritServiceTest {

  private final AritService aritService = new AritService();

  @Test
  void sum() {
    int result = aritService.sum(1, 2);
    assertEquals(3, result);
  }

  @Test
  void soustraction() {
    int result = aritService.soustraction(3, 2);
    assertEquals(1, result);
  }

  @Test
  void multiplication() {
    int result = aritService.multiplication(2, 5);
    assertEquals(10, result);
  }

  @Test
  void division() {
    int result = aritService.division(10, 2);
    assertEquals(5, result);
  }

  @Test
  void shouldThrowExceptionWhenAIsNull() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              aritService.sum(null, 5);
            });
    assertEquals("A and B cannot be null", exception.getMessage());
  }

  @Test
  void shouldThrowExceptionWhenBIsNull() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              aritService.sum(1, null);
            });
    assertEquals("A and B cannot be null", exception.getMessage());
  }

  @Test
  void shouldThrowExceptionWhenABIsNull() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              aritService.sum(null, null);
            });
    assertEquals("A and B cannot be null", exception.getMessage());
  }

  @Test
  void shouldThrowExceptionWhenAIsNegative() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              aritService.sum(-1, 5);
            });
    assertEquals("A and B cannot be negative", exception.getMessage());
  }

  @Test
  void shouldThrowExceptionWhenBIsNegative() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              aritService.sum(2, -5);
            });
    assertEquals("A and B cannot be negative", exception.getMessage());
  }

  @Test
  void shouldThrowExceptionWhenABIsNegative() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              aritService.sum(-1, -5);
            });
    assertEquals("A and B cannot be negative", exception.getMessage());
  }

  @Test
  void shouldThrowExceptionWhenBIsZero() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              aritService.division(5, 0);
            });
    assertEquals("Division by zero not allowed", exception.getMessage());
  }
}
