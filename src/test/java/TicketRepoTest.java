import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketRepoTest {
    Ticket ticket1 = new Ticket(1, 5000, "DVO", "MSK", 40000);
    Ticket ticket2 = new Ticket(2, 1000, "MSK", "ERS", 70000);
    Ticket ticket3 = new Ticket(3, 2000, "GDS", "KJH", 90000);
    Ticket ticket4 = new Ticket(4, 8000, "MSK", "KJH", 860000);
    Ticket ticket5 = new Ticket(5, 5000, "DVO", "MSK", 540000);

    private TicketRepo repo = new TicketRepo();

    @Test
    public void saveTest() {
        repo.save(ticket1);
        repo.save(ticket4);
        repo.save(ticket2);

        Ticket[] actual = repo.findAll();
        Ticket[] expected = {ticket1, ticket4, ticket2};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void removeByIdTest() {
        repo.save(ticket1);
        repo.save(ticket4);
        repo.save(ticket2);

        Ticket[] actual = repo.removeById(4);
        Ticket[] expected = {ticket1, ticket2};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findByIdTest() {
        repo.save(ticket1);
        repo.save(ticket4);
        repo.save(ticket2);

        Ticket[] actual = repo.findById(2);
        Ticket[] expected = {ticket2};

        Assertions.assertArrayEquals(actual, expected);
    }

}
