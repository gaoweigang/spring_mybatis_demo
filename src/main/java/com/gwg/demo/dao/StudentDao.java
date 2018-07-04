package com.gwg.demo.dao;

import com.gwg.demo.model.Student;

public interface StudentDao {
	public Student queryStudentByName(String name);
}
