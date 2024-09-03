package section03.properties.subsection02.i18n;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public MessageSource messageSource(){
        /* 접속하는 세션의 로케일에 따라 자동 재로딩하는 용도의 MessageSource 구현체 */

    }
}
