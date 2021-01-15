package gr.bill.safedispatcher;

public interface Event {
    EventSource getSource();

    long getTimestamp();
}
