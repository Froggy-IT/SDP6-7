package heroes;
import strategies.MagicAttack;
public class Mage extends Hero {
    public Mage(String name){
        super(name,80,new MagicAttack());
    }
}
