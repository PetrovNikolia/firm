package com.example.firm.exception.custom;

import com.example.firm.exception.ErrorType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GlobalException extends RuntimeException {

    private ErrorType errorType;

    public GlobalException() {
        this.errorType = ErrorType.GLOBAL_EXCEPTION;
    }

}
