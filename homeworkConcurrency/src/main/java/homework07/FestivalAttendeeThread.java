package homework07;

import java.util.LinkedList;
import java.util.Random;

public class FestivalAttendeeThread implements Runnable {

    private TicketType ticketType;
    private FestivalGate gate;
    private LinkedList<TicketType> list;
    Festival festival = new Festival();

    public FestivalAttendeeThread(FestivalGate gate, TicketType ticketType, LinkedList<TicketType> list) {
        this.ticketType = ticketType;
        this.gate = gate;
        this.list = list;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            ticketType = festival.generateRandomData();
            synchronized (list) {
                list.add(ticketType);
                System.out.println(i + 1 + " - " + ticketType);
            }

            try {
                Thread.sleep(150 + new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}