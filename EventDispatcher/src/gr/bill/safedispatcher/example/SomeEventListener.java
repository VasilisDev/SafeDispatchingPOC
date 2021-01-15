package gr.bill.safedispatcher.example;

import gr.bill.safedispatcher.Event;
import gr.bill.safedispatcher.IEventListener;

public class SomeEventListener implements IEventListener  {

    @Override
    public void notify(Event event) {
        System.out.printf("I receive an event with timestamp : %d",event.getTimestamp());
    }
}
