package com.rest_api.Rest.API.Prod.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
public class ApiResponse<T> {
    private T data;
    private ErrorDto error;
    private boolean success = true;

    public ApiResponse(T data)
    {
        this.data = data;
        log.debug("Created successful response with data :{}",data);
    }
    public ApiResponse(ErrorDto error) {
        this.error = error;
        this.success = false;
        log.error("Created error response: {}", error);
    }
    public static <T> ApiResponse<T> success(T data)
    {
        return new ApiResponse<>(data);
    }

    public static <T> ApiResponse<T> error(ErrorDto error) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setError(error);
        response.setSuccess(false);
        log.error("Created error response: {}", error);
        return response;
    }
}
