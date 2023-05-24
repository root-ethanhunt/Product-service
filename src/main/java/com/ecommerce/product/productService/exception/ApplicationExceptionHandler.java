package com.ecommerce.product.productService.exception;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

//import com.javatechie.api.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ecommerce.product.productService.model.ErrorDetails;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ApplicationExceptionHandler {


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> handleInvalidArgument(MethodArgumentNotValidException ex,HttpServletRequest request) {
    	
    	String error = "Validation error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        
//    	ErrorDto dto = new ErrorDetails(HttpStatus.BAD_REQUEST, "Validation error");
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(errors -> {
            errorMap.put(errors.getField(), errors.getDefaultMessage());
        });
//        return errorMap;
        ErrorDetails dto = new ErrorDetails();
        dto.setTimestamp(Instant.now());
        dto.setStatus(HttpStatus.BAD_REQUEST);
        dto.setError("Validation error");
        dto.setDetailedMessages(errorMap);
        dto.setPath(request.getRequestURI());
        
        return ResponseEntity.status(status).body(dto);
    }

//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(UserNotFoundException.class)
//    public Map<String, String> handleBusinessException(UserNotFoundException ex) {
//        Map<String, String> errorMap = new HashMap<>();
//        errorMap.put("errorMessage", ex.getMessage());
//        return errorMap;
//    }
    
    
//    @Data
//    public static class ErrorDto {
//
//        private final int status;
//        private final String error;
//        private final String message;
//        private Map<String, String>  detailedMessages;
//
//        public ErrorDto(HttpStatus httpStatus, String message) {
//            status = httpStatus.value();
//            error = httpStatus.getReasonPhrase();
//            this.message = message;
//        }
//
//    }

}



