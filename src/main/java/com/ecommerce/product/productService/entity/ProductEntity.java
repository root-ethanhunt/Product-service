package com.ecommerce.product.productService.entity;

import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.ecommerce.product.productService.constant.ProductConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Entity
@Table(name = ProductConstants.TABLE_NAME_PRODUCTS)
public class ProductEntity {

	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = ProductConstants.FIELD_PRODUCT_ID)
	private String productId;
	
	@Column(name = ProductConstants.FIELD_PRODUCT_TITLE)
	private String title;
	
	@Column(name = ProductConstants.FIELD_PRODUCT_DESC)
	private String desc;
	
	@Column(name = ProductConstants.FIELD_PRODUCT_IMG)
	private String img;
	
	@Column(name = ProductConstants.FIELD_PRODUCT_CATEGORIES)
	private List<String>categories;
	
	@Column(name = ProductConstants.FIELD_PRODUCT_SIZE)
	private String size;
	
	@Column(name = ProductConstants.FIELD_PRODUCT_COLOR)
	private String color;
	
	@Column(name = ProductConstants.FIELD_PRODUCT_PRICE)
	private int price; 
	

}
