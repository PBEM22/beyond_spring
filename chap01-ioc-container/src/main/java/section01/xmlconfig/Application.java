package section01.xmlconfig;

import common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("section01/xmlconfig/spring-context.xml");

        MemberDTO member1 = applicationContext.getBean("member", MemberDTO.class);
        MemberDTO member2 = applicationContext.getBean(MemberDTO.class);
        MemberDTO member3 = (MemberDTO) applicationContext.getBean("member");

    }
}
