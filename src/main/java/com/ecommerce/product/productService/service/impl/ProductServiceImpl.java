/**
 * 
 */
package com.ecommerce.product.productService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.product.productService.entity.ProductEntity;
import com.ecommerce.product.productService.mapper.EntityMapper;
import com.ecommerce.product.productService.mapper.ModelMapper;
import com.ecommerce.product.productService.model.Product;
import com.ecommerce.product.productService.repository.ProductRepository;
import com.ecommerce.product.productService.service.ProductService;

/**
 * @author vikas
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	private final EntityMapper entityMapper;
	private final ModelMapper modelMapper;
	private final ProductRepository productRepository;
	
	@Autowired
	public ProductServiceImpl(EntityMapper entityMapper, ModelMapper modelMapper, ProductRepository productRepository) {
		this.entityMapper = entityMapper;
		this.modelMapper = modelMapper;
		this.productRepository = productRepository;
	}

	
	 
//	@Override
//	public List<Product> getAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
    public Product create(Product product) {
//        String productId = UUID.randomUUID().toString();
//        product.setProductId(productId);
		ProductEntity pro = entityMapper.mapProductModelToEntity(product);
		ProductEntity prod= productRepository.save(pro);
         Product p = modelMapper.mapProductEntityToMapper(prod);
         return p;
    }
}
