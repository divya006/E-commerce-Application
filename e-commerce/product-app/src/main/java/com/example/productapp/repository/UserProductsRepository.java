package com.example.productapp.repository;

import com.example.productapp.domain.ProductUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProductsRepository extends MongoRepository<ProductUser,String> {
}
