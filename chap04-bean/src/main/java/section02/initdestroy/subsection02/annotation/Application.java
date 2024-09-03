package section02.initdestroy.subsection02.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = 
                new AnnotationConfigApplicationContext(ContextConfiguration.class);
    }
}
