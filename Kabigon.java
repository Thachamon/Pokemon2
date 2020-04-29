
public class Kabigon extends Pokemon {
    public Kabigon(String name){
        super(name, 1000);
        //hp = (int)(Math.random() * 1000);
    }

    public void attack(Pokemon enemy){
        System.out.println(" Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(5);
    }
}