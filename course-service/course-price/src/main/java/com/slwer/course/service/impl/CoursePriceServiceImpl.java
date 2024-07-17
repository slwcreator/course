package com.slwer.course.service.impl;

import com.slwer.course.client.CourseListClient;
import com.slwer.course.dao.CoursePriceMapper;
import com.slwer.course.entity.Course;
import com.slwer.course.entity.CourseAndPrice;
import com.slwer.course.entity.CoursePrice;
import com.slwer.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoursePriceServiceImpl implements CoursePriceService {

    @Autowired
    private CoursePriceMapper coursePriceMapper;

    @Autowired
    private CourseListClient courseListClient;

    @Override
    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapper.findCoursePrice(courseId);
    }

    @Override
    public List<CourseAndPrice> getCoursesAndPrice() {
        List<Course> courses = courseListClient.courseList();
        ArrayList<CourseAndPrice> courseAndPrices = new ArrayList<>();
        for (Course course : courses) {
            if (course != null) {
                CoursePrice coursePrice = getCoursePrice(course.getCourseId());
                CourseAndPrice courseAndPrice = new CourseAndPrice();
                courseAndPrice.setId(course.getId());
                courseAndPrice.setCourseId(course.getCourseId());
                courseAndPrice.setName(course.getCourseName());
                courseAndPrice.setPrice(coursePrice.getPrice());

                courseAndPrices.add(courseAndPrice);
            }
        }
        return courseAndPrices;
    }
}