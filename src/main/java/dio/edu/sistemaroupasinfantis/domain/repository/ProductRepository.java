package dio.edu.sistemaroupasinfantis.domain.repository;

import dio.edu.sistemaroupasinfantis.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
