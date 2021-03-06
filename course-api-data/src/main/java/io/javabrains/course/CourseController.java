package io.javabrains.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics")
    public List<Course> getAllTopics(){
        return courseService.getAllCourses();
    }

    @RequestMapping("/topics/{id}")
    public Course getTopic(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic (@RequestBody Course course, @PathVariable String id){
        courseService.updateCourse(id, course);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic (@PathVariable String id){
        courseService.deleteCourse(id);
    }




}
