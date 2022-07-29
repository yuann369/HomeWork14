import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket implements Comparable<Ticket> {
    protected int id;
    protected int cost;
    protected String departure;
    protected String arrival;
    protected int time;

    @Override
    public int compareTo(Ticket ticket) {
        if (cost < ticket.cost) {
            return -1;
        } else if (cost > ticket.cost) {
            return 1;
        }
        return 0;
    }
}
