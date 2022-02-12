package com.example.courseapi.course;




import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CourseRepo extends CrudRepository<Course,String> {

	public List<Course> findByTopicId(String topicId);
	
}
