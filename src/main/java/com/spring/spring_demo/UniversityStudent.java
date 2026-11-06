package com.spring.spring_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class UniversityStudent implements Student {

  public UniversityStudent() {
    System.out.println("In constructor:" + getClass().getSimpleName());
  }

  @Override
  public String getDailyAssignment() {
    return "Complete the assignment for the university student.";
  }
}
