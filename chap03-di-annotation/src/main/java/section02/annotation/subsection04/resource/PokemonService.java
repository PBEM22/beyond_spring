package section02.annotation.subsection04.resource;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import section02.common.Pokemon;

@Service("pokemonServiceResource")
//@AllArgsConstructor
public class PokemonService {

    // @Qualifier : 여러 개의 빈 객체 중 특정 빈 객체를 이름으로 지정하는 어노테이션
//    @Autowired
    @Resource(name = "pikachu")
    private Pokemon pokemon;

//    public PokemonService(Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }
//


    public void pokemonAttack(){
        pokemon.attack();
    }
}
