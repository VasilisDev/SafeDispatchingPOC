package gr.bill.safedispatcher;

public interface EventSource {

    void addListener(IEventListener listener);

    boolean removeListener(IEventListener listener);

    Iterable<IEventListener> listeners();

    boolean hasListeners();
}
