package com.example.demo.serveces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServicesImplementation implements StudentServices{
   @Autowired
	StudentRepository sr;

@Override
public List<Student> fetchAllStudent() {
	// TODO Auto-generated method stub
	
	return sr.findAll();
}
   

}
