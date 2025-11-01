package observers;

public class GameAnnouncer implements GameObserver {
    public void update(String event){
        System.out.println("[ANNOUNCER]"+event);
    }
}
