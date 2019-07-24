package com.gftraining;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Audience {

	// WITHOUT POINTCUT

	@Before("execution(* com.gftraining.Performance.perform(..))")
	public void silencePhones() {
		System.out.println("Silence Phones");
	}

	@AfterReturning("execution(* com.gftraining.Performance.perform(..))")
	public void clap() {
		System.out.println("PLAS PLAS PLAS");
	}

	@AfterThrowing("execution(* com.gftraining.Performance.perform(..))")
	public void boo() {
		System.out.println("!error");
	}

	// WITH POINTCUT
	@Pointcut("execution(* com.gftraining.Performance.perform(..))")
	public void performance() {
		// maker method -- empty
	}

	@Before("performance()")
	public void withpointcut1() {
		System.out.println("send with pointcut");
	}

	@Around("execution(* com.gftraining.Performance.perform(..))")
	public void doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println(">>>>>" + pjp.proceed());
	}

}