package com.example.Spring_Rest_API_Demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)

public class ResourceNotFoundException extends RuntimeException{
    private  String ResourceName;
    private String fieldName;
    private String fieldValue;



    public ResourceNotFoundException(String ResourceName, String fieldName, String fieldValue) {
        super(String.format("%s not found with String %s:'%s'",ResourceName,fieldName,fieldValue));
        this.ResourceName = ResourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }


    public String getFieldValue() {
        return fieldValue;
    }

    public String getResourceName() {
        return ResourceName;
    }

    public String getFieldName() {
        return fieldName;
    }
}
