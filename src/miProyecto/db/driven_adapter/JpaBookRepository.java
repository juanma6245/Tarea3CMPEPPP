package miProyecto.db.driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import miProyecto.core.domain.Book;
import miProyecto.core.domain.BookDoesNotExistException;
import miProyecto.core.driven_ports.BookRepository;
import miProyecto.db.driven_adapter.domain.BookEntity;
import miProyecto.db.driven_adapter.jparepository.HAAJpaRepository;

@Component
public class JpaBookRepository implements BookRepository {

	@Autowired // enlaza repositorio y servicio
	private HAAJpaRepository haaJpaRepository;

	@Override
	public Book findById(Long id) {
		Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);
		BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);
		return bookEntity.toBook();
	}
}
