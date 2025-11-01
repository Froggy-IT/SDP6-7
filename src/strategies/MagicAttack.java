package strategies;
import heroes.Hero;
public class MagicAttack implements AttackStrategy {
    @Override
    public int attack(Hero attacker, Hero target) {
        int damage=25;
        return damage;
    }
}
