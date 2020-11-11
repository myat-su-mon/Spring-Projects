package com.solt.jdc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CurrencyServiceAspect {

    @Pointcut("@annotation(com.solt.jdc.annotation.InTransaction)")
    public void transactionAnnotationPointcut() {
    }

    //@Before("transactionAnnotationPointcut()")
    public void beforeTransactionAnnotationAdvice() {
        System.out.println("Before - transactionAnnotationPointcut()");
    }

    @Pointcut("within(com.solt.jdc.bls.*)")
    public void blsPackagePointcut() {
    }

    //@Before("blsPackagePointcut()")
    public void beforeBlsPackageAdvice(JoinPoint joinPoint) {
        System.out.println("Before - blsPackagePointcut()" + joinPoint.getSignature());
    }

    @Pointcut("@within(com.solt.jdc.annotation.Secured)")
    public void securedClassPointcut() {
    }

    //@Before("securedClassPointcut()")
    public void beforeSecuredClassAdvice(JoinPoint joinPoint) {
        System.out.println("Before - securedClassPointcut()" + joinPoint.getSignature());
    }

    @Pointcut("execution(* com.solt.jdc.bls.CurrencyService.getExchangeRate(..))")
    public void getExchangeRateMethodPointcut() {
    }

    @Around("getExchangeRateMethodPointcut()")
    public Object aroundGetExchangeRateMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        try {
            System.out.println("Before - getExchangeRateMethodPointcut()");
            return proceedingJoinPoint.proceed();
        }finally {
            System.out.println("After - getExchangeRateMethodPointcut()");
        }
    }

    @Pointcut("bean(currency_service)")
    public void namedBeanPointcut(){
    }

    //@After("namedBeanPointcut()")
    public void afterNamedBeanAdvice(){
        System.out.println("After - namedBeanPointcut()");
    }

    @Pointcut("args(String, String, int)")
    public void stringsAndIntegerArgumentsMethodPointcut(){
    }

    //@After("stringsAndIntegerArgumentsMethodPointcut()")
    public void afterStringsAndIntegerArgumentsMethodAdvice(JoinPoint joinPoint){
        System.out.println("After - stringsAndIntegerArgumentsMethodPointcut()" + joinPoint.getSignature());
    }

    @Pointcut("@args(com.solt.jdc.annotation.Validated)")
    public void validatedArgumentPointcut(){
    }

    //@After("validatedArgumentPointcut()")
    public void afterValidatedArgumentAdvice(){
        System.out.println("After - validatedArgumentPointcut()");
    }

    @Pointcut("target(com.solt.jdc.bls.CurrencyService)")
    public void currencyServiceTargetPointcut(){
    }

    //@After("currencyServiceTargetPointcut()")
    public void afterCurrencyServiceTargetAdvice(){
        System.out.println("After - currencyServiceTargetPointcut()");
    }

    @Pointcut("@target(com.solt.jdc.annotation.Secured)")
    public void currencyServiceSecuredTargetPointcut(){
    }

    //@After("currencyServiceSecuredTargetPointcut()")
    public void afterCurrencyServiceSecuredTargetAdvice(){
        System.out.println("After - currencyServiceSecuredTargetPointcut()");
    }

    @Pointcut("this(com.solt.jdc.bls.CurrencyService)")
    public void currencyServiceThisPointcut(){
    }

    //@After("currencyServiceThisPointcut()")
    public void afterCurrencyServiceThisAdvice(){
        System.out.println("After - currencyServiceThisPointcut()");
    }

    @Pointcut("blsPackagePointcut() && transactionAnnotationPointcut()")
    public void blsPackageAndInTransactionPointcut(){
    }

    //@After("blsPackageAndInTransactionPointcut()")
    public void afterBlsPackageAndInTransactionAdvice(JoinPoint joinPoint){
        System.out.println("After - blsPackageAndInTransactionPointcut()"+ joinPoint.getSignature());
    }

    //@AfterThrowing(value = "execution(* com.solt.jdc.bls.CurrencyService.getCurrencyCountryName(..))", throwing = "exception")
    public void afterThrowingException(Exception exception){
        System.out.println("Exception was thrown from getCurrencyCountryName: " + exception.getClass().getName());
    }

    //@AfterReturning(value = "execution(* com.solt.jdc.bls.CurrencyService.getCurrencyCountryName(..))", returning = "value")
    public void afterReturningValue(String value){
        System.out.println("Value returned from getCurrencyCountryName: " + value);
    }

    @After(value = "execution(* com.solt.jdc.bls.CurrencyService.getCurrencyLongName(..))")
    public void test(JoinPoint joinPoint){
        String name = joinPoint.getSignature().toLongString();
        System.out.println(name + "is invoked. ");
        //System.out.println(joinPoint.getSignature());
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println(signature.getParameterNames());
    }

}
