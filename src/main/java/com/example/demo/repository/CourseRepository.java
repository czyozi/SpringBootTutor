package com.example.demo.repository;

import com.example.demo.modal.Course;
import com.example.demo.modal.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class CourseRepository {
    List<List<Integer>> res = new ArrayList<>();
    int[] arr;
    int target;

    public CourseRepository() {

    }


    public List<List<Integer>> findTwoSum(int[] arr, int target){
        //链接数据库
        //返回数据库的信息
        this.arr = arr;
        this.target = target;
        helper(0, new ArrayList<>());
        return  res;
    }

    public void helper(int start, List<Integer> list){
        if (list.size() == 2 && list.get(0) + list.get(1) == target) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);
            helper(i + 1, list);
            list.remove(list.size() - 1);
        }
    }

}
