package com.rest_api.Rest.API.Prod.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class InvalidPromotionException extends RuntimeException{
    private final String errorCode;
    private final String details;
    private final HttpStatus status;
    public InvalidPromotionException(String message, String errorCode, String details, HttpStatus status) {
        super(message);
        this.errorCode = errorCode;
        this.details = details;
        this.status = status;
    }
    public InvalidPromotionException(String message, String errorCode, HttpStatus status) {
        this(message, errorCode, null, status);
    }
}
