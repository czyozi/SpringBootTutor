package com.example.demo.service;


import com.example.demo.modal.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CourseService {

    @Autowired
    CourseRepository CourseRepository;

    public List<List<Integer>> findAllTwoSums(int target){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        return CourseRepository.findTwoSum(arr, target);
    }


}
