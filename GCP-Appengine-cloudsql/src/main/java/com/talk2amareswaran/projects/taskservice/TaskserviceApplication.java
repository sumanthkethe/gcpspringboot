package com.talk2amareswaran.projects.taskservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TaskserviceApplication {
	
	
	private static final Logger  log = LoggerFactory.getLogger(TaskserviceApplication.class);


	@Autowired
	TaskDAO taskDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(TaskserviceApplication.class, args);
	}
	
	@RequestMapping(value="/tasks/{id}", method=RequestMethod.GET)
	public String getTaskName(@PathVariable("id") String taskid) {
		
		log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");
		return taskDAO.getTaskNameById(taskid);
	}
}