package org.ling.config;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class MyExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);
    @ExceptionHandler({Exception.class})
    public ModelAndView handlerArithmeticException(Exception e){
        ModelAndView mv = new ModelAndView("error");
       logger.warn(e.toString());
        mv.addObject("er",e);
        return  mv;
    }
}
