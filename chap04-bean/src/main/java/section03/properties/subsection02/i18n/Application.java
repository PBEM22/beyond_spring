package section03.properties.subsection02.i18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.Locale;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String error404KR = context.getMessage("error404", null, Locale.KOREA);
        String error500KR = context.getMessage("error.500",
                new Object[]{"여러분", new Date()}, Locale.KOREA);
        String error404KR = context.getMessage("error404", null, Locale.KOREA);
        String error404KR = context.getMessage("error404", null, Locale.KOREA);
    }
}
