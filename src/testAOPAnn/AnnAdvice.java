package testAOPAnn;

import java.lang.reflect.Method;
import java.util.Arrays;

import javax.xml.ws.soap.Addressing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.MethodBeforeAdvice;

@Aspect
public class AnnAdvice {

//	@Pointcut("execution(* *(..))")
//	public void addPoint(){};
	
	@Before("execution(* *(..))")
	public void sayDoing(JoinPoint point){
		System.out.println("Doing something!"+Arrays.toString(point.getArgs()));
	}
	
//	public void before(Method arg0, Object[] arg1, Object arg2)
//			throws Throwable {
//		// TODO Auto-generated method stub
//		System.out.println("i Am befor execute!");
//
//	}

}
