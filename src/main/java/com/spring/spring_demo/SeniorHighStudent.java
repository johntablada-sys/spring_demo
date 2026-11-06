package com.spring.spring_demo;

import org.springframework.stereotype.Component;

@Component 
public class SeniorHighStudent implements Student {

  public SeniorHighStudent() {
    System.out.println("In constructor:" + getClass().getSimpleName());
  }

  @Override
  public String getDailyAssignment() {
    return "Complete the assignment for the senior high student.";
  }
}
