package homework07;

import java.util.LinkedList;
import java.util.Random;

public class Festival {

    TicketType ticketType;

    public void data() {

        LinkedList<TicketType> list = new LinkedList();
        FestivalGate gate = new FestivalGate("enterace", 1);

        TicketType ticketType = generateRandomData();

        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(list);
        statsThread.start();

        FestivalAttendeeThread festivalAttendeeThread = new FestivalAttendeeThread(gate, ticketType, list);
        Thread thread = new Thread(festivalAttendeeThread);
        thread.start();

    }

    public TicketType generateRandomData() {
        return ticketType = TicketType.values()[new Random().nextInt(TicketType.values().length)];
    }

}
