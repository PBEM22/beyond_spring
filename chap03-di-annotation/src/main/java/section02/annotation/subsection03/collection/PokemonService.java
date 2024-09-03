package section02.annotation.subsection03.collection;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import section02.common.Pokemon;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceCollection")
@AllArgsConstructor
public class PokemonService {

    // @Qualifier : 여러 개의 빈 객체 중 특정 빈 객체를 이름으로 지정하는 어노테이션
//    @Autowired
//    @Qualifier("pikachu")
//    private List<Pokemon> pokemon;

    private Map<String,Pokemon> pokemons;

    public void pokemonAttacks(){
        pokemons.forEach((k, v) -> {
            System.out.println(k + " " + v);
            v.attack();
        });
    }
//    public PokemonService(@Qualifier("pikachu") Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }
//

//    public void pokemonAttacks(){
//        for (Pokemon pokemons : pokemon){
//            pokemons.attack();
//        }
//    }

//    public void pokemonAttack(){
//        pokemon.attack();
//    }
}
