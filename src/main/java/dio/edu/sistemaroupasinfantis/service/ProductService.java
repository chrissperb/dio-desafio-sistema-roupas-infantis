package dio.edu.sistemaroupasinfantis.service;

import dio.edu.sistemaroupasinfantis.domain.model.Product;

public interface ProductService {
    Product findById(Long id);

    Product create(Product productToCreate);
}
