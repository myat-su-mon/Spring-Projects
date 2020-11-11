package com.solt.jdc.with.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CacheableAspect {

    private Logger logger = Logger.getLogger("cache.logger");

    @Around("@annotation(com.solt.jdc.with.aop.annotation.Cacheable)")
    public Object checkCache(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        logger.info(proceedingJoinPoint.getSignature() + "Cache Aspect started.");
        try {
            return proceedingJoinPoint.proceed();
        }finally {
            logger.info(proceedingJoinPoint.getSignature() + "Cache Aspect end.");
        }
    }
}
