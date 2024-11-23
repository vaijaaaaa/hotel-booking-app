package trainbookingapp.trainbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import trainbookingapp.trainbookingapp.entity.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, String> {
  public Iterable<Hotel> findAllByLocationAndDate(
    String location,
    String date
  );
}
