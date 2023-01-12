package com.springboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.course.entities.Category;
import com.springboot.course.entities.Order;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
