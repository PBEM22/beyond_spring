package section03.proxy.subsection01.dynamic;

import section03.proxy.common.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {

    /* 타겟 오브젝트 */
    private final Student student;

    public Handler(Student student) {
        this.student = student;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("===== 공부가 너무 하고 싶습니다 =====");
        System.out.println("호출 대상 메소드 : " + method);
        for(Object arg : args){
            System.out.println("전달 인자 : " + arg);
        }

        method.invoke(student, args);   // 타겟 메소드 호출

        System.out.println("=====  공부를 마치고 수면 학습을 시작합니다 =====");

        return proxy;
    }
}
