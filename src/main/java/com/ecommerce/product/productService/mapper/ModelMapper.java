package com.ecommerce.product.productService.mapper;

import org.springframework.stereotype.Component;

import com.ecommerce.product.productService.entity.ProductEntity;
import com.ecommerce.product.productService.model.Product;

@Component
public class ModelMapper {
	public Product mapProductEntityToMapper(ProductEntity productEntity) {
		Product product = new Product();
		product.setProductId(productEntity.getProductId());
		product.setTitle(productEntity.getTitle());
		product.setDesc(productEntity.getDesc());
		product.setImg(productEntity.getImg());
		product.setCategories(productEntity.getCategories());
		product.setColor(productEntity.getColor());
		product.setSize(productEntity.getSize());
		product.setPrice(productEntity.getPrice());
		
		return product;
	}

	
}
