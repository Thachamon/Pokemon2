import java.util.ArrayList;
import java.util.*;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("Hello Pokemon Game");
        Trainer t = new Trainer("Turtle");
        MainGame mg = new MainGame(t);
        //t.play();
        System.out.println("End Pokemon Game");    
    }
}