package com.assignment.demo.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Component
@Entity
@Table(name="categoryclass")
public class CategoryCodeClass {

    @Id
    private int CategoryCode;

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

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
