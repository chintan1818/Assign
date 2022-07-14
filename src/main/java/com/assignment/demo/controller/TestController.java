package com.assignment.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class TestController {

    @PostMapping("/FetchNextNumber/")
    public ResponseBody createUser(@RequestBody  user) throws Exception {



        return this.userService.createUser(user,setUserRole);



    }



}
