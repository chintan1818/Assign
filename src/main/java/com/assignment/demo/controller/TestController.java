package com.assignment.demo.controller;

import com.assignment.demo.model.CategoryCodeClass;
import com.assignment.demo.model.OldNew;
import com.assignment.demo.model.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/FetchNextNumber")
@CrossOrigin("*")
public class TestController {

    CategoryCodeClass categoryCodeClass=new CategoryCodeClass();


    Pair pair=new Pair(1,10);





    @PostMapping("/")
    public ResponseEntity<?> createUser(@RequestBody CategoryCodeClass categoryCodeClass) throws Exception {









        return ResponseEntity.ok();



    }



}
