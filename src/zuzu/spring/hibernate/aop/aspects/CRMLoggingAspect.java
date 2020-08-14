package zuzu.spring.hibernate.aop.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	private Logger log = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* zuzu.spring.hibernate.controller.*.*(..))")
	private void forControllerPkg() {
	}

	@Pointcut("execution(* zuzu.spring.hibernate.dao.*.*(..))")
	private void forDAOPkg() {
	}

	@Pointcut("execution(* zuzu.spring.hibernate.service.*.*(..))")
	private void forServicePkg() {
	}

	@Pointcut("forControllerPkg() ||forDAOPkg() ||forServicePkg()")
	private void forAppFlow() {
	}

	@Before("forAppFlow()")
	public void checkPoint(JoinPoint theJoinPoint) {

		log.info("Inside @Before------------->");
		String method = theJoinPoint.toShortString();
		log.info("called method: " + method);

		Object[] result = theJoinPoint.getArgs();

		for (Object theObject : result) {
			log.info("Arguments: " + theObject);
		}
	}

	@AfterReturning(pointcut = "forAppFlow()", returning = "theResult")
	public void afterResult(JoinPoint theJoinPoint, Object theResult) {

		log.info("Inside @AfterReturning------------->");
		String method = theJoinPoint.toShortString();
		log.info("from method: " + method);

		log.info("result: " + theResult);
	}
}
