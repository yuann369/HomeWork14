public class TicketRepo {
    private Ticket[] tickets = new Ticket[0];

    public Ticket[] findAll() {
        return tickets;
    }

    public void save(Ticket ticket) {
        int length = tickets.length + 1;
        Ticket[] tmp = new Ticket[length];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];

        }
        tmp[length - 1] = ticket;
        tickets = tmp;
    }

    public Ticket[] findById(int id) {
        Ticket result[] = new Ticket[1];
        int index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                result[index] = ticket;
            }
        }
        return result;
    }

    public Ticket[] removeById(int id) {
        int length = tickets.length - 1;
        Ticket[] tmp = new Ticket[length];
        int index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[index] = ticket;
                index++;
            }
        }
        return tickets = tmp;
    }
}
