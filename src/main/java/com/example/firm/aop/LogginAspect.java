package com.example.firm.aop;

import com.example.firm.entity.Log;
import com.example.firm.service.LogService;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
@RequiredArgsConstructor
public class LogginAspect {

    private final LogService logService;

    private final Logger logger = Logger.getLogger(LogginAspect.class.getName());

    @AfterReturning(pointcut = "execution(* com.example.firm.controller.RequestRestController.*(..))", returning = "result")
    public void logAfterReturningFile(JoinPoint jp, Object result) {

        logger(jp, result);
    }

    @AfterReturning(pointcut = "execution(* com.example.firm.exception.controller.ControllerAdvice.*(..))", returning = "result")
    public void logAfterReturningEx(JoinPoint jp, Object result) {

        logger(jp, result);
    }

    private void logger(JoinPoint jp, Object result) {
        Log myLog = new Log();

        String methodName = jp.getSignature()
                .getName();

        Date time = new Date();
        logger.log(Level.INFO, "название метода: " + methodName);
        logger.log(Level.INFO, "возвращенное значение: " + (result).toString());
        logger.log(Level.INFO, "время: " + time);
        logger.log(Level.INFO, "<----------------------------------------------------------------------------------->");

        myLog.setMethod(methodName);
        myLog.setResult((result).toString());
        myLog.setTime(time);
        logService.saveLog(myLog);
    }
}
