package com.cpe.card.card.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cpe.card.card.dto.UserDTO;
import com.cpe.card.card.dto.UserRegister;
import com.cpe.card.card.pojo.User;
import com.cpe.card.card.repository.UserRepository;
import com.sun.el.stream.Optional;

import lombok.Data;

@Data
@Service
public class UserService{

	private UserRepository userRepository;
    
    public User createUser(UserDTO userInfo) {
    	return userRepository.createUser(new User(1, "", userInfo.ge, userInfo.getSurname(), userInfo.getName(), 10.0));
    }
    
    public Boolean canBuy(int userId, double money) {
    	return userRepository.hasEnoughMoney(userId, money).isPresent();
    }
    
    public User getUserInfo(int userId) {
    	java.util.Optional<User> user = userRepository.findById(userId);
    	
    	if(user.is)
    }
    
    public Boolean login(UserRegister user) {
    	return (userRepository.findUserWithSurnameAndPassword(user.getSurname(), user.getPassword()) != null);
    }
}