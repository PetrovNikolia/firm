package com.example.firm.exception.controller;


import com.example.firm.exception.ErrorType;
import com.example.firm.exception.ResponseMessage;
import com.example.firm.exception.custom.GlobalException;
import com.example.firm.exception.custom.MyBadRequest;
import com.example.firm.exception.custom.MyNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

//@Controller
//@RestControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler/* implements ErrorController*/ {

    private static final String PATH = "/error";

   /* @RequestMapping(value = PATH)
    public ResponseEntity<Object> error(Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, ErrorType.GLOBAL_EXCEPTION, null, HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }*/

    @ExceptionHandler(MyBadRequest.class)
    public ResponseEntity<Object> exceptionHandler(MyBadRequest ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getErrorType(), null, HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(MyNotFoundException.class)
    public ResponseEntity<Object> exceptionHandler(MyNotFoundException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getErrorType(), null, HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<Object> exceptionHandler(GlobalException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getErrorType(), null, HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setTime(new Date());
        responseMessage.setMsg(body != null ? ((ErrorType) body).getMsg() : ex.getMessage());
        responseMessage.setStatus(status.toString());
        if (request instanceof ServletWebRequest) {
            ServletWebRequest request1 = (ServletWebRequest) request;
            responseMessage.setMethod(request1.getHttpMethod().toString());
            HttpServletRequest request2 = request1.getRequest();
            responseMessage.setPath(request2.getRequestURL().toString() + "?" + request2.getQueryString());
        } else {
            responseMessage.setMethod("Невозможно определить метод");
        }

        return super.handleExceptionInternal(ex, responseMessage, headers, status, request);
    }

}
