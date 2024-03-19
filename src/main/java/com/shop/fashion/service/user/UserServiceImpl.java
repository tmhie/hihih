package com.shop.fashion.service.user;

import com.shop.fashion.configuration.JwtProvider;
import com.shop.fashion.entity.User;
import com.shop.fashion.exception.UserException;
import com.shop.fashion.repository.UserRepository;
import com.shop.fashion.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    private JwtProvider jwtProvider;

    public UserServiceImpl(JwtProvider jwtProvider) {
        this.jwtProvider = jwtProvider;
    }

    @Override
    public User findUserById(Long userId) throws UserException {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()){
            return user.get();
        }
        throw new UserException("User not found with id: " + userId);
    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        String email = jwtProvider.getEmailFromToken(jwt);
        User user = userRepository.findByEmail(email);
        if (user == null){
            throw new UserException("User not found with email" + email);
        }
        return user;
    }
}
