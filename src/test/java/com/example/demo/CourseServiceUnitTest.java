package com.example.demo;

import com.example.demo.modal.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class CourseServiceUnitTest {
    @Mock
    private CourseService courseService;

    @Mock
    private CourseRepository courseRepository;

    @Test
    public void testCourseService(int target){
        List<List<Integer>> res = new ArrayList<>();
        int[] arr = {1,2,3,4, 5, 6, 7, 8,9,10};

        given(courseRepository.findTwoSum(arr, target)).willReturn(res);

        List<List<Integer>> result = courseService.findAllTwoSums(target);

        assertTrue(result.isEmpty());
    }

}
