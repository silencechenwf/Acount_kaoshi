package com.chinasofti.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/28.
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class TransactionAop {
    public TransactionAop(){
        System.out.println("建立事务");
    }
    @Before("execution(* com.chinasofti..service.*.*(..))")
    public void beginTrans(){
        System.out.println("开启事务");
    }
}
