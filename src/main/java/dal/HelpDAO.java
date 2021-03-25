package dal;

import domain.Help;
import org.springframework.data.repository.CrudRepository;

public interface HelpDAO extends CrudRepository<Help, Long> {
}
