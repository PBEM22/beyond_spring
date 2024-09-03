package section03.proxy.subsection02.cglib;

import org.springframework.cglib.proxy.InvocationHandler;
import section03.proxy.common.OhgiraffersStudent;

import java.lang.reflect.Method;

public class Handler implements InvocationHandler {

    /* Target Object로 class 타입 사용 가능 */
    private final OhgiraffersStudent ohgiraffersStudent;
    public Handler(OhgiraffersStudent ohgiraffersStudent) {
        this.ohgiraffersStudent = ohgiraffersStudent;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("===== 공부가 너무 하고 싶습니다 =====");
        System.out.println("호출 대상 메소드 : " + method);
        for(Object arg : args){
            System.out.println("전달 인자 : " + arg);
        }

        method.invoke(ohgiraffersStudent, args);   // 타겟 메소드 호출

        System.out.println("=====  공부를 마치고 수면 학습을 시작합니다 =====");

        return proxy;
    }
}
