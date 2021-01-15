import gr.bill.safedispatcher.EventDispatcher;
import gr.bill.safedispatcher.EventSource;
import gr.bill.safedispatcher.example.SomeEvent;
import gr.bill.safedispatcher.example.SomeEventListener;
import gr.bill.safedispatcher.example.SomeEventSource;

public class Main {

    public static void main(String[] args) {
        EventSource eventSource = new SomeEventSource();
        EventDispatcher eventDispatcher = EventDispatcher.get();
        eventDispatcher.addSource(eventSource);
        eventDispatcher.addListener(new SomeEventListener());
        eventDispatcher.notify(new SomeEvent(eventSource));
    }
}
