package miProyecto.core.domain;

import miProyecto.core.driven_ports.BookRepository;
import miProyecto.core.driver_ports.BookService;

public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;
	
	
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@Override
	public Book getBook(Long id) {
		
		return bookRepository.findById(id);
	}

}
