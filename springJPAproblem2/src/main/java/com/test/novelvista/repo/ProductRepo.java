package com.test.novelvista.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.novelvista.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

	
}