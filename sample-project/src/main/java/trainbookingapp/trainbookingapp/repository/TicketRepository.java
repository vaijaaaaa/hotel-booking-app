package trainbookingapp.trainbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import trainbookingapp.trainbookingapp.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, String> {
  public Ticket findByPnr(String pnr);

  public Iterable<Ticket> findAllByEmail(String email);
}
