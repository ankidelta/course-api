package com.course.api.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	/*
	 * private List<Topic> topics = new ArrayList<Topic>(Arrays.asList( new
	 * Topic("Java", "Java 8", "Java Collection API"), new Topic("JavaScript",
	 * "JavaScript 5", "JavaScript API"), new Topic("Spring", "Spring Framework",
	 * "Spring Framework 4.x") ));
	 */
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics :: add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {	
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		
		/*
		 * for(int i=0;i<topics.size();i++) { Topic t = topics.get(i);
		 * if(t.getId().equals(id)) { topics.set(i, topic); } }
		 */
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t->t.getId().equals(id));
		topicRepository.delete(id);
	}
}
