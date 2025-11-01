package heroes;
import observers.GameObserver;
import java.util.ArrayList;
import java.util.List;
public abstract class Hero {
    protected String name;
    protected int health;
    protected strategies.AttackStrategy strategy;

    private List<GameObserver> observers = new ArrayList<>();

    public Hero(String name, int health, strategies.AttackStrategy strategy) {
        this.name = name;
        this.health = health;
        this.strategy = strategy;
    }

    // ===== Observer pattern methods =====
    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(String event) {
        for (GameObserver o : observers) {
            o.update(event);
        }
    }

    // ===== Hero methods =====
    public void setStrategy(strategies.AttackStrategy strategy) {
        this.strategy = strategy;
        notifyObservers(name + " switched strategy to " + strategy.getClass().getSimpleName());
    }

    public void attack(Hero target) {
        int damage = strategy.attack(this, target);
        target.takeDamage(damage);
        notifyObservers(name + " attacked " + target.name + " for " + damage + " damage!");
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            health = 0;
            notifyObservers(name + " has been defeated!");
        } else {
            notifyObservers(name + " now has " + health + " HP left.");
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}
