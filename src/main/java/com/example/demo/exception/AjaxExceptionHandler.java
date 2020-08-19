package com.example.demo.exception;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.JsonResult;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AjaxExceptionHandler {
    @ExceptionHandler(value=Exception.class)
	public JsonResult defaultErrorHandler(HttpServletRequest req, 
			Exception e) throws Exception {

		e.printStackTrace();
		return JsonResult.errorException(e.getMessage());
	}
}