package com.example.courseapi.course;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class CourseService  {
	 // this is singleton 
	// application context looks for this in class path scan and register this and make it a bean
	

// ===================================== Database Connected Values===============================================
	
	
	@Autowired
	private CourseRepo courseRepo;

	
	
	
	


	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepo.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	
    public Optional<Course> getCourse(String id) {
		
		
		return courseRepo.findById(id);
	}
	
	

	public void addCourse(Course course) {
		
		 courseRepo.save(course);
		
	}

	

	public void updateCourse(Course course) {
		
		courseRepo.save(course);  // this method will by default find the id and update the topic there
		
		
	}
	
	public void deleteCourse(String id) {
	      
		courseRepo.deleteById(id);
		
	}
	
	
	
	
	
	

	

}
