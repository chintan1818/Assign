package com.assignment.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryCodeClassRepository extends JpaRepository  <com.assignment.demo.model.CategoryCodeClass, Integer> {
}
