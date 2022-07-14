package com.assignment.demo.service;

import com.assignment.demo.repo.CategoryCodeClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryCodeClassServiceImpl implements CategoryCodeClassService {


    @Autowired
    CategoryCodeClassRepository categoryCodeClassRepository;
    public int codeByValue(int code)
    {

            try {
                com.assignment.demo.model.CategoryCodeClass cat = (com.assignment.demo.model.CategoryCodeClass) categoryCodeClassRepository.findById(code).get();
                int value=cat.getValue();
                return  value;


            }
            catch (Exception e)
            {
                System.out.println("CategoryCode not found in the database");
            }


            return -1;

    }

    @Override
    public void setValueByCode(int code, int value) {
        com.assignment.demo.model.CategoryCodeClass cat = (com.assignment.demo.model.CategoryCodeClass) categoryCodeClassRepository.findById(code).get();
        cat.setValue(value);
         categoryCodeClassRepository.save(cat);

    }
}
