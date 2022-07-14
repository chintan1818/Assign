package com.assignment.demo.controller;

import com.assignment.demo.model.CategoryCodeClass;
import com.assignment.demo.model.OldNew;
import com.assignment.demo.model.Pair;
import com.assignment.demo.repo.CategoryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/FetchNextNumber")
@CrossOrigin("*")
public class TestController {

    CategoryCodeClass categoryCodeClass=new CategoryCodeClass();


    Pair pair=new Pair(1,10);

    @Autowired
    CategoryCode categoryCode;

    @Autowired
    OldNew oldNew;


    @PostMapping("/")
    public ResponseEntity<?> createUser(@RequestBody CategoryCodeClass input) throws Exception {


        input.getCategoryCode();

        CategoryCodeClass cat = (CategoryCodeClass) categoryCode.findById(input.getCategoryCode()).get();
        int value=cat.getValue();

        OldNew oldNew1=oldNew;
        oldNew1.setOldValue(value);

        int ans=value+10-sumOfIndividualDigit(value);
        System.out.println("number :" + value +" ans is"+ans );

        oldNew1.setNewValue(ans);

        return ResponseEntity.ok(oldNew1);



    }


    static int sumOfIndividualDigit(int n) {
        int sum = 0;

        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}


