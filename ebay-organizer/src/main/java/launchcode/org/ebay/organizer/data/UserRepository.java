package launchcode.org.ebay.organizer.data;

import launchcode.org.ebay.organizer.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
