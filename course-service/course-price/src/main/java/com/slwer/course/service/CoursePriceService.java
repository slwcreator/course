package com.slwer.course.service;

import com.slwer.course.entity.CourseAndPrice;
import com.slwer.course.entity.CoursePrice;

import java.util.List;

public interface CoursePriceService {
    CoursePrice getCoursePrice(Integer courseId);

    List<CourseAndPrice> getCoursesAndPrice();
}