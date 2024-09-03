package section01.scope.subsection01.singleton;

import common.Beverage;
import common.Bread;
import common.Product;
import common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵", 1000, new Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("딸기우유", 1500, 500);
    }

    @Bean
    public Product water(){
        return new Beverage("지리산암반수", 3000, 1000);
    }

    @Bean
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
}
