package com.gwg.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwg.demo.dao.StudentDao;
import com.gwg.demo.model.Student;

@Service
public class StudentService {
	
	@Autowired(required=true)
	private StudentDao studentDao;
	
	
	public Student getStudentByName(Student student){
		System.out.println("Student："+student);
		String name = student.getName();
		System.out.println(name);
		Student result =  studentDao.queryStudentByName(name);
		return result;
	}

}
