package com.example.demo.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.pojo.JsonResult;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

// @ControllerAdvice
public class DemoExceptionHandler {
    public static final String ERROR_VIEW = "error";

	// @ExceptionHandler(value = Exception.class)
//     public Object errorHandler(final HttpServletRequest reqest, final HttpServletResponse response, final Exception e)
//             throws Exception {
//         e.printStackTrace();

//         final ModelAndView mav = new ModelAndView();
//         mav.addObject("exception", e);
//         mav.addObject("url", reqest.getRequestURL());
//         mav.setViewName(ERROR_VIEW);
//         return mav;
//    }
    @ExceptionHandler(value=Exception.class)
    public Object errorHandler(HttpServletRequest request, 
            HttpServletResponse response, Exception e) throws Exception {
            e.printStackTrace();

            if (isAjax(request)) {
                return JsonResult.errorException(e.getMessage());
            } else {
                ModelAndView mav = new ModelAndView();
                mav.addObject("exception", e);
                mav.addObject("url", request.getRequestURL());
                mav.setViewName(ERROR_VIEW);
                return mav;
            }
    }

	public static boolean isAjax(HttpServletRequest httpRequest){
		return  (httpRequest.getHeader("X-Requested-With") != null  
					&& "XMLHttpRequest"
						.equals( httpRequest.getHeader("X-Requested-With").toString()) );
	}
}