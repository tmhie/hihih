package com.shop.fashion.service.user;

import com.shop.fashion.entity.User;
import com.shop.fashion.exception.UserException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;
}
