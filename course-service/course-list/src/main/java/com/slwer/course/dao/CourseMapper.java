package com.slwer.course.dao;

import com.slwer.course.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {
    @Select("SELECT * FROM course WHERE valid = 1")
    List<Course> findValidCourses();
}
