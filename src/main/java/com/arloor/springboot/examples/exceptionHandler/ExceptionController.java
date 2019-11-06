package com.arloor.springboot.examples.exceptionHandler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @RequestMapping("/a")
    public int aaa(){
        return 1/0; //会产生一个Exception
    }
}
