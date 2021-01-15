package gr.bill.safedispatcher.example;

import gr.bill.safedispatcher.Event;
import gr.bill.safedispatcher.EventSource;

public class SomeEvent implements Event {

    private final EventSource eventSource;

    public SomeEvent(EventSource eventSource) {
        this.eventSource = eventSource;
    }

    @Override
    public EventSource getSource() {
        return eventSource;
    }

    @Override
    public long getTimestamp() {
        return System.currentTimeMillis();
    }
}
