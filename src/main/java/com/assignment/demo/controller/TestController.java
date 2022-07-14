package com.assignment.demo.controller;

import com.assignment.demo.model.CategoryCodeClass;
import com.assignment.demo.model.OldNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/FetchNextNumber")
@CrossOrigin("*")
public class TestController {

    CategoryCodeClass categoryCodeClass=new CategoryCodeClass();


    @PostMapping("/")
    public ResponseEntity<?> createUser(@RequestBody CategoryCodeClass categoryCodeClass) throws Exception {



        OldNew oldNew1=new OldNew();
        oldNew1.setNewValue(1);
        oldNew1.setOldValue(10);


        return ResponseEntity.ok(oldNew1);



    }



}
