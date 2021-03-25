package dal;

import domain.Help;
import org.springframework.data.repository.CrudRepository;

public interface helpRepository extends CrudRepository<Help, Long> {
}
