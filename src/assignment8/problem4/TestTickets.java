package assignment8.problem4;

public class TestTickets {
    public static void main(String[] args) {
        TickingSystem ts = new TickingSystem();
        //generate 10 tickets
        for (int i = 0; i < 10; i++) {
            ts.addTicket("Taylor swift");
        }
        System.out.println("There are " + ts.getTicketsNum() + " tickets.");

        Ticket t = null;
        for (int i = 0; i < 5; i++){
            t = ts.processTicket();
            if (t != null)
                System.out.println("Get ticket " + t.getId());
        }


        System.out.println("There are " + ts.getTicketsNum() + " tickets.");

        for (int i = 0; i < 10; i++){
            t = ts.processTicket();
            if (t != null)
                System.out.println("Get ticket " + t.getId());
        }

        System.out.println("There are " + ts.getTicketsNum() + " tickets.");

        //generate 10 tickets
        for (int i = 0; i < 5; i++) {
            ts.addTicket("Justin Bieber");
        }

        System.out.println("There are " + ts.getTicketsNum() + " tickets.");
        for (int i = 0; i < 8; i++){
            t = ts.processTicket();
            if (t != null)
                System.out.println("Get ticket " + t.getId());
        }




    }
}
