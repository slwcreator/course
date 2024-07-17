package com.slwer.course.client;

import com.slwer.course.entity.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseListClientHystrix implements CourseListClient {
    @Override
    public List<Course> courseList() {
        List<Course> courses = new ArrayList<>();
        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("默认课程");
        course.setId(1);
        course.setValid(1);
        courses.add(course);
        return courses;
    }
}
