package section02.annotation.subsection01.primary;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import section02.common.Pokemon;

@Service("pokemonServicePrimary")
@AllArgsConstructor
public class PokemonService {

    private Pokemon pokemon;

    public void pokemonAttack(){
        pokemon.attack();
    }
}
