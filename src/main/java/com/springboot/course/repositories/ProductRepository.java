package com.springboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.course.entities.Product;
import com.springboot.course.entities.User;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
