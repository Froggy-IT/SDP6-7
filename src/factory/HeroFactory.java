package factory;
import heroes.*;
public class HeroFactory {
    public static Hero createHero(String type,String name){
        type=type.toLowerCase();
        switch(type){
            case "warrior":
                return new Warrior(name);
            case "mage":
                return new Mage(name);
            case "archer":
                return new Archer(name);
            default:
                throw new IllegalArgumentException("Unknown hero type: "+type);
        }
    }
}
