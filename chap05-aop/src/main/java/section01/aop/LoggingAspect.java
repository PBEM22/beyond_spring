package section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Aspect // pointcut과 advice를 하나의 클래스 단위로 정의하기 위한 어노테이션
public class LoggingAspect {

    // Pointcut : 여러 Join Point를 매치하기 위해 지정한 표현식
    @Pointcut("execution(* section01.aop.*Service.*(..))")
    public void logPointcut(){

    }

    @After("logPointcut()")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("after joinPoint.get");
    }

    // AfterReturning -> 정상 수행 시
    @AfterReturning(pointcut = "logPointcut()", returning = "result")
    public void logAfterReturn(JoinPoint joinPoint, Object result){

        System.out.println("after returning result : " + result);

        if (result != null && result instanceof Map){
            ((Map<Long, MemberDTO>) result).put(100L, new MemberDTO(100L, "반환 값 가공"));

        }
    }

    // AfterThrowing -> exception 발생 시
    @AfterThrowing(pointcut = "logPointcut()", throwing = "exception")
    public void logAfterThrow(JoinPoint joinPoint, Exception exception){

        System.out.println("after throwing exception : " + exception);
    }

    // Around : 핵심 기능 시작과 끝을 감싸고 동작
//    @Around("logPointcut()")
//    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
//
//        System.out.println("around before : " + joinPoint.getSignature());
//
//        Object result = joinPoint.proceed();    // 원본 조인 포인트를 실행
//
//        System.out.println("around");
//
//    }
}
