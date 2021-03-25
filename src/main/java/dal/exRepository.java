package dal;

import domain.Ex;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface exRepository extends CrudRepository<Ex, Long> {
}
