package edmt.dev.androidpokemon.Common;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

import edmt.dev.androidpokemon.Model.Pokemon;

public class Common {
    public static List<Pokemon> commonPokemonList = new ArrayList<>();
    public static final String KEY_ENABLE_HOME = "position";
    public static final String KEY_NUM_EVOLUTION = "num";

    public static int getColorByType(String type) {
        switch(type)
        {

            case "Normal":
                return Color.parseColor("#A4A27A");


            case "Dragon":
                return Color.parseColor("#743BFB");



            case "Psychic":
                return Color.parseColor("#F15B85");


            case "Electric":
                return Color.parseColor("#E9CA3C");


            case "Ground":
                return Color.parseColor("#D9BF6C");


            case "Grass":
                return Color.parseColor("#81C85B");

            case "Poison":
                return Color.parseColor("#A441A3");

            case "Steel":
                return Color.parseColor("#BAB7D2");


            case "Fairy":
                return Color.parseColor("#DDA2DF");


            case "Fire":
                return Color.parseColor("#F48130");


            case "Fight":
                return Color.parseColor("#BE3027");


            case "Bug":
                return Color.parseColor("#A8B822");


            case "Ghost":
                return Color.parseColor("#705693");


            case "Dark":
                return Color.parseColor("#745945");


            case "Ice":
                return Color.parseColor("#9BD8D8");


            case "Water":
                return Color.parseColor("#658FF1");
            default:
                return Color.parseColor("#658FA0");
        }
    }

    public static Pokemon findPokemonByNum(String num) {
        for(Pokemon pokemon : commonPokemonList)
        {
            if(pokemon.getNum().equals(num))
                return pokemon;
        }
        return null;
    }

    public static List<Pokemon> findPokemonsByType(String type) {
        List<Pokemon> result = new ArrayList<>();
        for(Pokemon pokemon : commonPokemonList)
        {
            if(pokemon.getType().contains(type))
                result.add(pokemon);
        }
        return result;
    }
}


