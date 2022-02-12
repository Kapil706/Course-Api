package com.example.courseapi.topic;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TopicRepo extends CrudRepository<Topic,String> {

	
	
}
