package com.spring.spring_demo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.spring.spring_demo.Student;


@RestController
public class SampleRestController {
  private final Student myStudent;
  private final Student anotherStudent;

  public SampleRestController(
      @Qualifier("elementaryStudent") Student myStudent,
      @Qualifier("elementaryStudent") Student anotherStudent) {
    this.myStudent = myStudent;
    this.anotherStudent = anotherStudent;
  }

  @GetMapping("/check")
  public String checkScope() {
    return "myStudent == anotherStudent? " + (myStudent == anotherStudent);
  }

  @GetMapping("/assignment")
  public String getDailyAssignment() {
    return myStudent.getDailyAssignment();
  }

  @GetMapping("/")
  public String sayHello(){
    return "Hello World!";
  }
}
