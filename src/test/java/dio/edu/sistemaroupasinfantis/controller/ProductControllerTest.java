package dio.edu.sistemaroupasinfantis.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dio.edu.sistemaroupasinfantis.ApplicationTests;
import dio.edu.sistemaroupasinfantis.domain.model.Product;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class ProductControllerTest extends ApplicationTests {

    @Test
    void findProductByIdTest() throws IOException {
        //Context
        ObjectMapper objectMapper = new ObjectMapper();
        Product[] products = new Product[7];

        for (int i = 0; i < 7; i++) {
            String jsonFilePath = "product" + (i + 1) + ".json";
            Product product = objectMapper.readValue(new File(jsonFilePath), Product.class);
            products[i] = product;
        }

        //Action
        for (Product product : products) {
            System.out.println("Descrição: " + product.getDescription());
            System.out.println("Código: " + product.getCode());
            System.out.println("Preço: " + product.getPrice());
    }

        //@Test
        // void createProductTest() {
        //Context

        //Action

        //
    }
}