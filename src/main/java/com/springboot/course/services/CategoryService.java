package com.springboot.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.course.entities.Category;
import com.springboot.course.entities.Order;
import com.springboot.course.repositories.CategoryRepository;
import com.springboot.course.repositories.OrderRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();		
	}
	
	public Category findById(long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
}
