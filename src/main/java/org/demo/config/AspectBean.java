package org.demo.config;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectBean {

    @Pointcut("execution(* transfer(..))")// the pointcut expression
    private void anyOldTransfer() {}// the pointcut signature

    @Around("anyOldTransfer()")
    public Object doAccessCheck(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("do Access Check");
        Object proceed = pjp.proceed();
        System.out.println("after access check");
        return proceed;
    }
}
