package com.poja.demo.endpoint.arit.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.poja.demo.endpoint.arit.service.AritService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AritControllerTest {

  @Mock private AritService aritService;

  @InjectMocks private AritController aritController;

  @Test
  void sum() {
    when(aritService.sum(5, 3)).thenReturn(8);
    int result = aritController.sum(5, 3);
    assertEquals(8, result);
    verify(aritService).sum(5, 3);
  }

  @Test
  void soustraction() {
    when(aritService.soustraction(5, 3)).thenReturn(2);
    int result = aritController.soustraction(5, 3);
    assertEquals(2, result);
    verify(aritService).soustraction(5, 3);
  }

  @Test
  void multiplication() {
    when(aritService.multiplication(5, 3)).thenReturn(15);
    int result = aritController.multiplication(5, 3);
    assertEquals(15, result);
    verify(aritService).multiplication(5, 3);
  }

  @Test
  void division() {
    when(aritService.division(10, 2)).thenReturn(5);
    int result = aritController.division(10, 2);
    assertEquals(5, result);
    verify(aritService).division(10, 2);
  }

  @Test
  void shouldPropagateNullValidationException() {
    when(aritService.sum(null, 3))
        .thenThrow(new IllegalArgumentException("A and B cannot be null"));

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> aritController.sum(null, 3));

    assertEquals("A and B cannot be null", exception.getMessage());
    verify(aritService).sum(null, 3);
  }

  @Test
  void shouldPropagateNegativeValidationException() {
    when(aritService.sum(-1, 3))
        .thenThrow(new IllegalArgumentException("A and B cannot be negative"));

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> aritController.sum(-1, 3));

    assertEquals("A and B cannot be negative", exception.getMessage());
    verify(aritService).sum(-1, 3);
  }

  @Test
  void shouldPropagateDivisionByZero() {
    when(aritService.division(10, 0)).thenThrow(new ArithmeticException("Division by zero"));

    assertThrows(ArithmeticException.class, () -> aritController.division(10, 0));
    verify(aritService).division(10, 0);
  }
}
