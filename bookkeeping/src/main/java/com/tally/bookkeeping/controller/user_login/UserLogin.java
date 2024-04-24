package com.tally.bookkeeping.controller.user_login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tally.bookkeeping.entity.mongo.User;
import com.tally.bookkeeping.repository.UserRepository;

@RestController
@RequestMapping("/login")
public class UserLogin {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user_login")
	public User getLogin() {
		System.out.println("hello");
		User user = new User();
		user.setName("test");
		user.setAge(22);

		User restult = userRepository.save(user);
		System.out.println("done");
		return restult;

	}

}
