package trainbookingapp.trainbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import trainbookingapp.trainbookingapp.entity.UserTicket;

public interface UserTicketRepository
  extends CrudRepository<UserTicket, Integer> {
  Iterable<UserTicket> findAllByPnr(String pnr);
}
