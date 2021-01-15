package gr.bill.safedispatcher;

public class EventDispatcher implements IEventListener, EventSource {

    private static volatile EventDispatcher instance;
    private EventSource eventSource;

    private EventDispatcher() {
        throw new UnsupportedOperationException();
    }

    public static EventDispatcher get() {
        //double check locking
        if (instance == null) {
            synchronized (EventDispatcher.class) {
                if (instance == null) {
                    instance = new EventDispatcher();
                }
            }
        }
        return instance;
    }

    public void addSource(EventSource eventSource) {
        this.eventSource = eventSource;
    }

    public void removeSource() {
        this.eventSource = null;
    }

    @Override
    public void addListener(IEventListener listener) {
        this.eventSource.addListener(listener);
    }

    @Override
    public boolean removeListener(IEventListener listener) {
        if (hasListeners()) {
            return eventSource.removeListener(listener);
        }
        return false;
    }

    @Override
    public Iterable<IEventListener> listeners() {
        return eventSource.listeners();
    }

    @Override
    public boolean hasListeners() {
        return eventSource.hasListeners();
    }

    @Override
    public void notify(Event event) {
        eventSource.listeners().forEach(listener -> listener.notify(event));
    }
}
