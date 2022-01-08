package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

// Repository for persistence operation (DAOImpl)
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
