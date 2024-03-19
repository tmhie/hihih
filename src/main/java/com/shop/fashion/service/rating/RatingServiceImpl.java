package com.shop.fashion.service.rating;

import com.shop.fashion.entity.Product;
import com.shop.fashion.entity.Rating;
import com.shop.fashion.entity.User;
import com.shop.fashion.exception.ProductException;
import com.shop.fashion.repository.RatingRepository;
import com.shop.fashion.request.RatingRequest;
import com.shop.fashion.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService{
    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private ProductService productService;

    @Override
    public Rating createdRating(RatingRequest request, User user) throws ProductException {
        Product product = productService.findProductById(request.getProductId());
        Rating rating = new Rating();
        rating.setProduct(product);
        rating.setUser(user);
        rating.setRating(request.getRating());
        rating.setCreatedAt(LocalDateTime.now());
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getProductsRating(Long productId) {
        return null;
    }
}
