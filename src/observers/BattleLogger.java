package observers;

public class BattleLogger implements GameObserver {
    public void update(String event){
        System.out.println("[LOG]"+event);
    }
}
