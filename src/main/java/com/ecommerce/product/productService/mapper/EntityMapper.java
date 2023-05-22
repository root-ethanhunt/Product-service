package com.ecommerce.product.productService.mapper;

import org.springframework.stereotype.Component;

import com.ecommerce.product.productService.entity.ProductEntity;
import com.ecommerce.product.productService.model.Product;

@Component
public class EntityMapper {
public ProductEntity mapProductModelToEntity(Product productModel) {
	ProductEntity product = new ProductEntity();
	product.setProductId(productModel.getProductId());
	product.setTitle(productModel.getTitle());
	product.setDesc(productModel.getDesc());
	product.setImg(productModel.getImg());
	product.setCategories(productModel.getCategories());
	product.setColor(productModel.getColor());
	product.setSize(productModel.getSize());
	product.setPrice(productModel.getPrice());
	
	return product;
}
}
