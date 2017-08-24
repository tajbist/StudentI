package com.dev.aspect;

import com.dev.controller.StudentController;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by Oops on 12/28/2016.
 */
@Aspect
@Component
public class Check {
    @Pointcut("execution(*com.dev.controller.StudentController.*())")
    public void trace(){
        System.out.println("Going to setup student profile.");
        LOGGER.info("A request was issued for a sample name: "+ StudentController.class.getName());

    }
}
