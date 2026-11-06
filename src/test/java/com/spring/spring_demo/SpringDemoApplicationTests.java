package com.spring.spring_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import com.spring.spring_demo.rest.SampleRestController;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringDemoApplicationTests {

	@Autowired
	private ConfigurableListableBeanFactory beanFactory;

	@Autowired
	private SampleRestController sampleRestController;

	@Test
	void contextLoads() {
	}

	@Test
	void primaryStudentIsUniversityStudent() {
		assertInstanceOf(UniversityStudent.class, beanFactory.getBean(Student.class));
	}

	@Test
	void juniorHighStudentIsLazy() {
		assertFalse(beanFactory.containsSingleton("juniorHighStudent"));
	}

	@Test
	void sameElementaryStudentIsInjectedTwiceAsSingleton() {
		assertEquals("myStudent == anotherStudent? true", sampleRestController.checkScope());
	}
}
