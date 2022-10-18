package miProyecto.db.driven_adapter.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import miProyecto.db.driven_adapter.domain.BookEntity;

public interface HAAJpaRepository extends JpaRepository<BookEntity, Long> {}
