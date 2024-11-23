package trainbookingapp.trainbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import trainbookingapp.trainbookingapp.entity.VerifyUser;

public interface VerifyUserRepository
  extends CrudRepository<VerifyUser, String> {
  public VerifyUser findByEmail(String email);

  public void deleteByEmail(String email);
}
