package com.example.product.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.product.category.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}