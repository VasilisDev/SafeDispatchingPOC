package gr.bill.safedispatcher.example;

import gr.bill.safedispatcher.EventSource;
import gr.bill.safedispatcher.IEventListener;

import java.util.ArrayList;
import java.util.List;

public class SomeEventSource implements EventSource {

    private final List<IEventListener> listeners = new ArrayList<>();

    @Override
    public void addListener(IEventListener listener) {
        listeners.add(listener);
    }

    @Override
    public boolean removeListener(IEventListener listener) {
        return listeners.remove(listener);
    }

    @Override
    public Iterable<IEventListener> listeners() {
        return listeners;
    }

    @Override
    public boolean hasListeners() {
        return !listeners.isEmpty();
    }
}
