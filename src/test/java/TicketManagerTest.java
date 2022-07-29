import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {

    Ticket ticket1 = new Ticket(1, 5000, "DVO", "MSK", 40000);
    Ticket ticket2 = new Ticket(2, 8000, "MSK", "KJH", 70000);
    Ticket ticket3 = new Ticket(3, 2000, "GDS", "KJH", 90000);
    Ticket ticket4 = new Ticket(4, 3000, "MSK", "KJH", 860000);
    Ticket ticket5 = new Ticket(5, 5000, "KJH", "MSK", 540000);
    Ticket ticket6 = new Ticket(6, 5000, "DVO", "MSK", 540000);
    Ticket ticket7 = new Ticket(7, 10000, "MSK", "KJH", 540000);
    Ticket ticket8 = new Ticket(8, 5000, "DVO", "MSK", 540000);


    private TicketRepo repo = new TicketRepo();
    private TicketManager manager = new TicketManager(repo);

    @Test
    public void findAllSortTest() {
        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
        repo.save(ticket4);
        repo.save(ticket5);
        repo.save(ticket6);
        repo.save(ticket7);
        repo.save(ticket8);

        Ticket[] actual = manager.findAll("MSK", "KJH");
        Ticket[] expected = {ticket4, ticket2, ticket7};

        Assertions.assertArrayEquals(actual, expected);
    }
}
