package com.ecommerce.product.productService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.product.productService.constant.ProductConstants;
import com.ecommerce.product.productService.model.Product;
import com.ecommerce.product.productService.service.ProductService;

@CrossOrigin(origins = ProductConstants.CROSS_ORIGIN)
@RestController
@RequestMapping(ProductConstants.PRODUCT_API)
public class ProductController {
//	 @Autowired
//	    BlogRespository blogRespository;

//	    @GetMapping("/blog")
//	    public List<Blog> index(){
//	        return blogRespository.findAll();
//	    }
	
	@Autowired
    private ProductService productService;

    //create

//    @PreAuthorize("hasAuthority('Admin')")
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(product));
    }


    //get single
//    @PreAuthorize("hasAuthority('SCOPE_internal')")
//    @GetMapping("/{hotelId}")
//    public ResponseEntity<Product> createHotel(@PathVariable String productId) {
//        return ResponseEntity.status(HttpStatus.OK).body(productService.get(productId));
//    }


    //get all
//    @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
//    @GetMapping
//    public ResponseEntity<List<String>> getAll(){
//        return ResponseEntity.ok(productService.getAll());
//    }

}
