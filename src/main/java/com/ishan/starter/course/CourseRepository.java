package com.ishan.starter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ishan.starter.topic.Topic;

public interface CourseRepository extends CrudRepository<Course,String>{

	public List<Course> findByTopicId(String id);
	
}
