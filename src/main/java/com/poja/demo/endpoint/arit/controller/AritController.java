package com.poja.demo.endpoint.arit.controller;

import com.poja.demo.endpoint.arit.service.AritService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arit")
@AllArgsConstructor
public class AritController {
  private final AritService aritService;

  @PostMapping("/sum")
  public int sum(@RequestParam Integer a, @RequestParam Integer b) {
    return aritService.sum(a, b);
  }

  @PostMapping("/soustraction")
  public int soustraction(@RequestParam Integer a, @RequestParam Integer b) {
    return aritService.soustraction(a, b);
  }

  @PostMapping("/multiplication")
  public int multiplication(@RequestParam Integer a, @RequestParam Integer b) {
    return aritService.multiplication(a, b);
  }

  @PostMapping("/division")
  public int division(@RequestParam Integer a, @RequestParam Integer b) {
    return aritService.division(a, b);
  }
}
