package com.arloor.springboot.examples.exceptionHandler;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@CommonsLog
@ControllerAdvice //用于修改Controller的返回，不加这个注解不会修改返回
public class ExceptionHandlerImpl {

    @ExceptionHandler(Exception.class) //指定该方法处理所有的异常
    public String handler(Exception e) {
        e.printStackTrace();
        log.error(e);
        return "err:"+e.getMessage();
    }
}
