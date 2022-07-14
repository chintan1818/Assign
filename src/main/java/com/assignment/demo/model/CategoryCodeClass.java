package com.assignment.demo.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



public class CategoryCodeClass {

    private int CategoryCode;

    public int getCategoryCode() {
        return CategoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        CategoryCode = categoryCode;
    }


    public CategoryCodeClass() {
    }

    public CategoryCodeClass(int categoryCode) {
        CategoryCode = categoryCode;
    }
}
