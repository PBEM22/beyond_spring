package section02.javaconfig;

import common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection02")
public class ConfigurationContext {

    @Bean(name = "MemberDTO")
    public MemberDTO getMember(){
        return new MemberDTO(1, "user01", "pass01", "홍길동");
    }
}
