package com.shop.fashion.service.product;

import com.shop.fashion.entity.Product;
import com.shop.fashion.exception.ProductException;
import com.shop.fashion.request.CreateProductRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public interface ProductService {
    public Product createProduct(CreateProductRequest request);
    public String deleteProduct(Long productId) throws ProductException;
    public Product updateProduct(Long productId,Product request) throws ProductException;
    public Product findProductById(Long id) throws ProductException;
    public List<Product> findProductByCategory(String category);
    public Page<Product> getAllProduct(String category,List<String> colors,List<String>sizes,Integer minPrice,Integer maxPrice,
                                       Integer minDiscount,String sort,String stock,Integer pageNumber,Integer pageSize);
}
