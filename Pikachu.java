
public class Pikachu extends Pokemon {
    public Pikachu(String name){
        super(name);
        hp = (int)(Math.random() * 100);
    }

    public void attack(Pokemon enemy){
        System.out.println(" Pokemon " + name + " attack " + enemy.getName());
    }
}

