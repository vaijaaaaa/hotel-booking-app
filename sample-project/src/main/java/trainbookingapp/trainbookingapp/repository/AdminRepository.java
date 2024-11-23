package trainbookingapp.trainbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import trainbookingapp.trainbookingapp.entity.Admin;

public interface AdminRepository extends CrudRepository<Admin, String> {
  public Admin findByAadhar(String aadhar);

  public Admin findByEmail(String email);
}
