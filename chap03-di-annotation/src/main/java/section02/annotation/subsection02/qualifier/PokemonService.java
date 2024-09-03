package section02.annotation.subsection02.qualifier;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import section02.common.Pokemon;

@Service("pokemonServiceQualifier")
//@AllArgsConstructor
public class PokemonService {

    // @Qualifier : 여러 개의 빈 객체 중 특정 빈 객체를 이름으로 지정하는 어노테이션
    @Autowired
    @Qualifier("pikachu")
    private Pokemon pokemon;

//    public PokemonService(@Qualifier("pikachu") Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }
//


    public void pokemonAttack(){
        pokemon.attack();
    }
}
