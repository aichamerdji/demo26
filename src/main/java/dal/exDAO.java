package dal;

import domain.Ex;
import org.springframework.data.repository.CrudRepository;

public interface exDAO extends CrudRepository<Ex, Long> {}