package heroes;
import strategies.MeleeAttack;
public class Warrior extends Hero {
    public Warrior(String name){
        super(name,100,new MeleeAttack());
    }
}
