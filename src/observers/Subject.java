package observers;

public interface Subject {
    void registerObserver(GameObserver o);
    void removeObserver(GameObserver o);
    void notifyObservers(String event);
}
