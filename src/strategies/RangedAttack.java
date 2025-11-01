package strategies;
import heroes.Hero;
public class RangedAttack implements AttackStrategy {
    @Override
    public int attack(Hero attacker, Hero target) {
        int damage=15;
        return damage;
    }
}
