package com.spring.spring_demo.rest;

import com.spring.spring_demo.Student;

public class ElementaryStudent implements Student {
  
  public ElementaryStudent() {
    System.out.println("In constructor:"+getClass().getSimpleName());
  }

  @Override 
  public String getDailyAssignment() {
    return "Have to complete 日本語しゅくだい";
  }
}
