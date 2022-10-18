package miProyecto.core.driven_ports;

import miProyecto.core.domain.Book;

public interface BookRepository {
	Book findById(Long id);
}
