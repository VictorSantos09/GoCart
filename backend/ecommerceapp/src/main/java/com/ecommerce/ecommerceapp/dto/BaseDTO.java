package com.ecommerce.ecommerceapp.dto;

public class BaseDTO {
    private final String message;
    private final Boolean isSuccess;

    public BaseDTO(String message, Boolean isSuccess) {
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }
}
