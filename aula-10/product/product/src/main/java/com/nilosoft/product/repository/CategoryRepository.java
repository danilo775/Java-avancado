package com.nilosoft.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilosoft.product.model.Category;


public interface CategoryRepository  extends JpaRepository<Category, Long> {

}
