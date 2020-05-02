package homework07;

import java.util.LinkedList;

public class FestivalStatisticsThread extends Thread {

    private int full = 0;
    private int fullvip = 0;
    private int freepass = 0;
    private int oneday = 0;
    private int onedayvip = 0;
    private int total = 0;

    private LinkedList<TicketType> list;

    public FestivalStatisticsThread(LinkedList<TicketType> list) {
        this.list = list;
    }

    public synchronized void run() {

        TicketType type;

        while (true) {

            synchronized (this) {
                for (int i = 0; i < list.size(); i++) {

                    type = list.poll();

                    if (type == TicketType.FULL) {
                        full++;
                    } else if (type == TicketType.FULLVIP) {
                        fullvip++;
                    } else if (type == TicketType.FREEPASS) {
                        freepass++;
                    } else if (type == TicketType.ONEDAY) {
                        oneday++;
                    } else if (type == TicketType.ONEDAYVIP) {
                        onedayvip++;
                    }

                    total = full + fullvip + oneday + onedayvip + freepass;
                }
            }
            try {
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (total != 0) {
                System.out.println("\n" + total + " people entered\n" + full + " people have full tickets\n"
                        + freepass + " have free passes\n" + fullvip + " have full VIP passes\n"
                        + oneday + " have one-day passes\n" + onedayvip + " have one-day VIP passes\n");
            }

            if (total == 100) {
                break;
            }
        }
    }
}
