package com.course.api.course;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
public interface CourseRepository extends CrudRepository<Course, String> {

	Iterable<Course> findByTopicId(String topicId);

	//public List<Course> findByTopicId();
}
