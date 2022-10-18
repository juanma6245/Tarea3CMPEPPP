package miProyecto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import miProyecto.core.domain.BookServiceImpl;
import miProyecto.core.driven_ports.BookRepository;
import miProyecto.core.driver_ports.BookService;

@Configuration
public class SpringBeans {
        @Bean
        BookService bookService(final BookRepository bookRepository) {
            return new BookServiceImpl(bookRepository);
}
}