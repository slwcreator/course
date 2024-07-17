package com.slwer.course.controller;

import com.slwer.course.client.CourseListClient;
import com.slwer.course.entity.Course;
import com.slwer.course.entity.CoursePrice;
import com.slwer.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursePriceController {
    @Autowired
    private CoursePriceService coursePriceService;

    @Autowired
    private CourseListClient courseListClient;

    @GetMapping("/price")
    public Integer getCoursePrice(Integer courseId) {
        CoursePrice coursePrice = coursePriceService.getCoursePrice(courseId);
        return coursePrice.getPrice();
    }

    @GetMapping("/coursesInPrice")
    public List<Course> getCourseListInPrice() {
        return courseListClient.courseList();
    }
}
