package com.training.springbatchdemo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JobController {
  @GetMapping("/health")
  public String health() {
    return "Spring Batch training application is running";
  }
  // TODO: Add the JobLauncher endpoint.
}