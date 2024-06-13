package assignment8.problem4;

import java.util.LinkedList;
import java.util.Queue;

public class TickingSystem {
    Queue<Ticket> tickets;
    int nextId;

    public TickingSystem() {
        tickets = new LinkedList<>();
        nextId = 0;
    }

    public void addTicket(String description) {
        if (description == null) {
            return;
        }
        tickets.add(new Ticket(++nextId, description));
    }

    public Ticket processTicket(){
        if (tickets.isEmpty()) {
            System.out.println("There are no tickets to process");
            return null;
        }
        return tickets.remove();
    }

    public Ticket viewNextTicket(){
        if (tickets.isEmpty()) {
            System.out.println("There are no tickets to view");
            return null;
        }
        return tickets.peek();
    }

    public int getTicketsNum(){
        return tickets.size();
    }

}
