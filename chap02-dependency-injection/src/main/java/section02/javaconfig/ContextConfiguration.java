package section02.javaconfig;

import common.Account;
import common.MemberDTO;
import common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20, "110-234-567890");
    }

    /* bean 등록에 사용 된 메소드를 호출하여 의존성 주입을 처리할 수 있다. */
    @Bean(name = "member")
    public MemberDTO memberGenerator(){
        /* 1. 생성자 주입 */
//        return new MemberDTO(1, "홍길동", "010-1234-5678", "hong@gmail.com", accountGenerator());

        /* 2. setter 주입 */
        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setSequence(1);
        memberDTO.setName("홍길동");
        memberDTO.setPhone("010-1234-5678");
        memberDTO.setEmail("hong@gmail.com");
        memberDTO.setPersonalAccount(accountGenerator());

        return memberDTO;



    }
    
    @Bean(name = "user")
    public MemberDTO memberDTO(){
        /* 3. 빌더패턴 사용 */
        return MemberDTO.builder()
                .sequence(1)
                .name("홍길동")
                .email("hong@gmail.com")
                .phone("010-1234-5678")
                .personalAccount(accountGenerator())
                .build();
    }
}
