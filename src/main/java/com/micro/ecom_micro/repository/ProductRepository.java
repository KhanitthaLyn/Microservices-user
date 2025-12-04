package com.micro.ecom_micro.repository;

import com.micro.ecom_micro.dto.ProductResponse;
import com.micro.ecom_micro.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByActiveTrue();
}
