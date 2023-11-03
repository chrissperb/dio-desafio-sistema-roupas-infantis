package dio.edu.sistemaroupasinfantis.service;

import dio.edu.sistemaroupasinfantis.domain.model.Product;

public interface ProductService {
    Product findProductById(Long id);

    Product createProduct(Product productToCreate);
}
