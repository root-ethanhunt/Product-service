package com.ecommerce.product.productService.model;
import java.time.Instant;
import java.util.Map;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Data
public class ErrorDetails {
	 private Instant timestamp;
	    private HttpStatus status;
	    private String error;
	    private Map<String, String>  detailedMessages;
	    private String path;
		
}
