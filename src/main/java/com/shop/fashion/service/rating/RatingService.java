package com.shop.fashion.service.rating;

import com.shop.fashion.entity.Rating;
import com.shop.fashion.entity.User;
import com.shop.fashion.exception.ProductException;
import com.shop.fashion.request.RatingRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {
    public Rating createdRating(RatingRequest request, User user) throws ProductException;

    public List<Rating> getProductsRating(Long productId);
}
