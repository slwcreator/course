package com.slwer.course.service.impl;

import com.slwer.course.dao.CoursePriceMapper;
import com.slwer.course.entity.CoursePrice;
import com.slwer.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursePriceServiceImpl implements CoursePriceService {

    @Autowired
    private CoursePriceMapper coursePriceMapper;

    @Override
    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapper.findCoursePrice(courseId);
    }
}