package com.slwer.course.dao;

import com.slwer.course.entity.CoursePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CoursePriceMapper {

    @Select("SELECT * FROM course_price WHERE course_id = #{courseId}")
    CoursePrice findCoursePrice(Integer courseId);
}