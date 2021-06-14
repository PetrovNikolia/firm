package com.example.firm.exception.custom;
import com.example.firm.exception.ErrorType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyBadRequest extends RuntimeException {

    private ErrorType errorType;

    public MyBadRequest() {
        this.errorType = ErrorType.BAD_REQUEST;
    }
}
