package com.assignment.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
@EnableJpaRepositories("com.assignment.*")
public interface CategoryCode extends JpaRepository<CategoryCode, Integer> {
}
