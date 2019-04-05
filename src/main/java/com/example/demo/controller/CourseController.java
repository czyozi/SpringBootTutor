package com.example.demo.controller;

import com.example.demo.modal.Course;
import com.example.demo.modal.dto.CourseDto;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// single function interface
@RestController
@RequestMapping
public class CourseController {
    @Autowired // IOC
    CourseService CourseService; // Singleton



    @GetMapping(path = "/look-up/{target}", produces = "application/json")
    public HttpEntity<Integer> findTwoSum(@PathVariable("target") int target) {

        List<List<Integer>> res = CourseService.findAllTwoSums(target);

        return new ResponseEntity(res, HttpStatus.OK);
    }
}
