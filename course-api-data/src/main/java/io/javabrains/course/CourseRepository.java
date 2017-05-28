package io.javabrains.course;

import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, String>{


    //getAllTopics()

    //getTopicGivenId(String id)
    //UpdateTopic(Course t)
    //DeleteTopic(String id)



}
