package com.nick.lesson10.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Aspects 切面类
 * @author NickFayne 2018-06-07 21:08
 */
@Aspect
@Component
public class LogAspects {

    @Pointcut("execution(public int com.nick.lesson10.model.Person.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object [] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName() + " 开始做除法... " + args[0] + " / "+ args[1]);
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + " 完成做除法...");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result){
        System.out.println(joinPoint.getSignature().getName() + " 做除法返回... " + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex){
        System.out.println(joinPoint.getSignature().getName() + " 做除法有异常... " + ex);
    }

}
