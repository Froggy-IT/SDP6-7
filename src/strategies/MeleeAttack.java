package strategies;
import heroes.Hero;
public class MeleeAttack implements AttackStrategy{
    @Override
    public int attack(Hero attacker, Hero target) {
        int damage=20;
        return damage;
    }
}
