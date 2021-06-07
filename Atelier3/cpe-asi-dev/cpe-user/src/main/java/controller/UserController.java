package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.UserDTO;
import dto.UserRegister;
import pojo.User;
import rest.UserRest;
import service.UserService;

@CrossOrigin
@RestController
public class UserController implements UserRest {

	@Autowired
	private UserService userService;

	@Override
	public ResponseEntity<Double> addMoney(Integer id, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Double> removeMoney(Integer id, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<HttpStatus> addCard(Integer id, Integer cardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<HttpStatus> removeCard(Integer id, Integer cardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Integer> getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<UserDTO> createUser(UserRegister userRegister) {
		// TODO Auto-generated method stub
		return null;
	}

}