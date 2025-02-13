package com.rest_api.Rest.API.Prod.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDto {
    private String errorCode;
    private String errorMessage;
    private String errorDetails;

    public ErrorDto(String errorCode,String errorMessage)
    {
        this(errorCode,errorMessage,null);
    }
}
