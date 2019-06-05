package com.zl.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 1.新建一个全局的异常类
 * 2.在class上添加注解,@ControllerAdvice
 * 3.在class中添加一个方法
 * 4.在方法上添加@ExceptionHandler拦截相应的异常
 * 5.如果返回的是View   ---方法的返回值是ModelAndView
 * 6.如果返回的是String或者是JSON数据,那么需要在方法上添加@ResponseBody注解
 * @author pactera
 *
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ModelAndView exceptionHandler(HttpServletRequest request, Exception exception) throws Exception {
        ModelAndView modelAndView= new ModelAndView();
    	
    	modelAndView.setViewName("/error.html");
    
    	return modelAndView;
    }
	
}
