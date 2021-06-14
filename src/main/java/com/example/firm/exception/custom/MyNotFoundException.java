package com.example.firm.exception.custom;

import com.example.firm.exception.ErrorType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyNotFoundException extends RuntimeException {

    private ErrorType errorType;

    public MyNotFoundException() {
        this.errorType = ErrorType.NOT_FOUND_EXCEPTION;
    }

}
