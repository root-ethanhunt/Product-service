package com.ecommerce.product.productService.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class Product {
	
	private String productId;
	
	private String title;
	private String desc;
	private String img;
	private List<String>categories;
	private String size;
	private String color;
	private int price; 
	

}
