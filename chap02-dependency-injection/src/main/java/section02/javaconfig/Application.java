package section02.javaconfig;

import common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member1 = context.getBean("member", MemberDTO.class);
        MemberDTO member2 = context.getBean("user", MemberDTO.class);
        System.out.println(member1.getEmail());
        System.out.println(member1);

        System.out.println(member2.getEmail());
        System.out.println(member2);
    }
}
