package com.ishan.starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	// Using Embedded Apache Derby Server 
	
	public List<Topic> getAllTopics() {
		return (List<Topic>)topicRepository.findAll();  // Downcasting a iterable to list 
		// can be done by applying forEach on iterable
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findById(id).orElse(null);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		 topicRepository.deleteById(id);

	}
}
