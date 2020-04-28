import java.security.Policy;
import java.util.*;

public class Trainer {
    
    private ArrayList<Pokemon> bag;
    private Scanner sc;
    public Trainer(){
        bag = new ArrayList<Pokemon>();
        bag.add(new Pikachu("Pikachu of satochi"));
        sc = new Scanner(System.in);
    }

    public void play(){
            String cmd = "";

            do{
                System.out.print("Enter cmd : ");
                cmd = sc.nextLine();
                if(cmd.equals("print")){
                    printPokemon();
                }
                else if(cmd.equals("catchPokemon")){
                    catchPokemon();
                }
            }while(!cmd.equals("q"));
    }

    public void catchPokemon(){
        System.out.println("Catch Pokemons");
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        int pokemonNumber = (int)(Math.random()*5);
        for(int i=0; i<pokemonNumber; ++i){
            int type = (int)(Math.random()*2);
            if (type == 0){
                pokemons.add(new Pikachu("Wild Pikachu"));
            }
            else if (type == 1){
                pokemons.add(new Kabigon("Wild Kabigon"));
            }
        }

        System.out.println("Pokemon around you");
        int no = 0;
        for(Pokemon p : pokemons){
            System.out.println("No. " + no + " " + p.getName());
            no++;
        }

        System.out.println("You catch: ");
        no = sc.nextInt();

        bag.add(pokemons.get(no));
    }

    public void printPokemon(){
        System.out.println("Pokemon in bag");
        for(Pokemon p: bag){
            System.out.println(p);
        }  
    }    
    
}