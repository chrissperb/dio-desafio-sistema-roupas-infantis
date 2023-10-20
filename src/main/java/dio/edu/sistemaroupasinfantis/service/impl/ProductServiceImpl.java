package dio.edu.sistemaroupasinfantis.service.impl;

import dio.edu.sistemaroupasinfantis.domain.repository.ProductRepository;
import dio.edu.sistemaroupasinfantis.domain.model.Product;
import dio.edu.sistemaroupasinfantis.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Product create(Product productToCreate) {
        // TODO: Create a CODE EXISTENCE verifying condition
        return productRepository.save(productToCreate);
    }
}
