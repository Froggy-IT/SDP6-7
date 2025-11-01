package main;
import heroes.*;
import observers.*;
import strategies.*;
import factory.*;
import singleton.*;
public class Game {
    public void run(){
        BattleArena arena=BattleArena.getInstance();
        Hero warrior=HeroFactory.createHero("warrior","Aragon");
        Hero mage=HeroFactory.createHero("mage","Gandalf");
        Hero archer=HeroFactory.createHero("archer","Legolas");
        GameObserver logger=new BattleLogger();
        GameObserver announcer=new GameAnnouncer();
        warrior.addObserver(logger);
        warrior.addObserver(announcer);
        mage.addObserver(logger);
        mage.addObserver(announcer);
        archer.addObserver(logger);
        archer.addObserver(announcer);
        arena.addHero(warrior);
        arena.addHero(mage);
        arena.addHero(archer);
        arena.startBattle();
        warrior.attack(mage);
        mage.attack(warrior);
        mage.setStrategy(new MagicAttack());
        mage.attack(archer);
        archer.setStrategy(new RangedAttack());
        archer.attack(warrior);
        warrior.attack(archer);
        System.out.println("\n===Battle ended===");
    }
}
