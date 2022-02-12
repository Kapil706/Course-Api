package com.example.courseapi.topic;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class TopicService  {
	 // this is singleton 
	// application context looks for this in class path scan and register this and make it a bean
	

// ===================================== Database Connected Values===============================================
	
	
//	
	@Autowired
	private TopicRepo topicRepo;
//	
	
	
	
	



	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}

	
    public Optional<Topic> getTopic(String id) {
		
		
		return topicRepo.findById(id);
	}
	
	

	public void addTopic(Topic topic) {
		
		 topicRepo.save(topic);
		
	}

	

	public void updateTopic(Topic topic, String id) {
		
		topicRepo.save(topic);  // this method will by default find the id and update the topic there
		
		
	}
	
	public void deleteTopic(String id) {
	      
		topicRepo.deleteById(id);
		
	}
	
	
	
	
	
	
//==================================== HardCoded Values =======================================================	
/*	
	List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic("Spring","Spring boot","Spring boot is best for developing microserivces"),
			new Topic("Java","Java 8","Java 8 provides best java functions"),
			new Topic("Python","Python 3 ","Python 3 is easy to learn and can be used in data science")
			)); 
	
	// Arrays.asList() creates a immutable list so if you want to add something make it mutable 
 // by converting it into ArrayList<>
	
	public List<Topic> getAllTopics(){
		return topics;
	}


	public Topic getTopic(String id) {
		
		
		
		return topics.stream().filter(topic-> topic.getId().equalsIgnoreCase(id)).findFirst().get();
		
	}


	public void addTopic(Topic topic) {
		
		 topics.add(topic);
		
	}


	public void updateTopic(Topic topic, String id) {
		
		
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equalsIgnoreCase(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
		
	}


	public void deleteTopic(String id) {
	      
		topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
		
	}
	
*/	
	
	
	
	

}
