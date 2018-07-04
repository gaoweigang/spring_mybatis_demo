package com.gwg.demo.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gwg.demo.model.Student;

public class ApplicationContextTest {

	@Test
	public void testSampleLoad() {

		ApplicationContext bf = new ClassPathXmlApplicationContext("application.xml");
		StudentService studentService = (StudentService) bf.getBean("studentService");

		Student queryCondition = new Student();
		queryCondition.setName("gaoweigang");
		Student std = studentService.getStudentByName(queryCondition);
		System.out.println(std);

	}

}
