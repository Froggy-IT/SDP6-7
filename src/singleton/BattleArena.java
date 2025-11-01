package singleton;
import heroes.Hero;
import java.util.*;
public class BattleArena {
    private static BattleArena instance;
    private List<Hero> heroes=new ArrayList<>();
    private BattleArena(){}
    public static BattleArena getInstance(){
        if (instance==null)
            instance=new BattleArena();
        return instance;
    }
    public void addHero(Hero hero){
        heroes.add(hero);
    }
    public List<Hero> getHeroes(){
        return heroes;
    }
    public void startBattle(){
        System.out.println("\n==Battle Begins in the Arena==\n");
    }
}
