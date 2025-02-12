package org.tutorials.springbootthymeleafcrudexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.tutorials.springbootthymeleafcrudexample.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
