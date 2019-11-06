package com.arloor.springboot.examples.modelAttribute;


import com.alibaba.fastjson.JSONObject;
import com.arloor.springboot.examples.exceptionHandler.ExceptionHandlerImpl;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@CommonsLog
public class BaseController extends ExceptionHandlerImpl {
    //ModelAttribute会在任何
    @ModelAttribute("request")
    public HttpServletRequest populateModel(HttpServletRequest request) { ;
        return request;
    }

    @RequestMapping("/b")
    public String test(@ModelAttribute("request")HttpServletRequest request){
        return JSONObject.toJSONString(request.getRequestURI());
    }


}
