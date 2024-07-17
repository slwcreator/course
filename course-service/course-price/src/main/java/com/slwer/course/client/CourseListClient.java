package com.slwer.course.client;

import com.slwer.course.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 描述：课程列表的 Feign 客户端
 */
@Primary
@FeignClient(value = "course-list", fallback = CourseListClientHystrix.class)
public interface CourseListClient {
    @GetMapping("/course")
    List<Course> courseList();
}
