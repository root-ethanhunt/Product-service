package com.ecommerce.product.productService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.product.productService.entity.ProductEntity;
import com.ecommerce.product.productService.model.Product;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

	

	

}
