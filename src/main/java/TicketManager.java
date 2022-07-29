import java.util.Arrays;

public class TicketManager {
    private TicketRepo repo = new TicketRepo();

    public TicketManager(TicketRepo repo) {
        this.repo = repo;
    }

    public TicketManager() {
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] res = new Ticket[0];
        for (Ticket ticket : repo.findAll()) {
            if ((ticket.arrival.equals(to)) && (ticket.getDeparture().equals(from))) {
                Ticket[] ans = new Ticket[res.length + 1];
                for (int i = 0; i < res.length; i++) {
                    ans[i] = res[i];
                }
                ans[ans.length - 1] = ticket;
                res = ans;
            }
        }
        Arrays.sort(res);
        return res;
    }
}
