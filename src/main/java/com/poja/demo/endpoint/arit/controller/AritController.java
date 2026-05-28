package com.poja.demo.endpoint.arit.controller;

import com.poja.demo.endpoint.arit.service.AritService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/arit")
@AllArgsConstructor
public class AritController {
  private final AritService aritService;

  @GetMapping("/sum")
  public int sum(
      @RequestParam(required = false) Integer a, @RequestParam(required = false) Integer b) {
    return aritService.sum(a, b);
  }

  @GetMapping("/soustraction")
  public int soustraction(
      @RequestParam(required = false) Integer a, @RequestParam(required = false) Integer b) {
    return aritService.soustraction(a, b);
  }

  @GetMapping("/multiplication")
  public int multiplication(
      @RequestParam(required = false) Integer a, @RequestParam(required = false) Integer b) {

    return aritService.multiplication(a, b);
  }

  @GetMapping("/division")
  public int division(
      @RequestParam(required = false) Integer a, @RequestParam(required = false) Integer b) {
    return aritService.division(a, b);
  }
}
