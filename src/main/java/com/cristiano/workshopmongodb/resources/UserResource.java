package com.cristiano.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cristiano.workshopmongodb.domain.User;
import com.cristiano.workshopmongodb.dto.UserDTO;
import com.cristiano.workshopmongodb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> list = new ArrayList<>();
		List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		//User maria = new User("1001", "Maria Brown", "maria@gmail.com");
		//User alex = new User("1002", "Alex Green", "alex@gmail.com");
		//list.addAll(Arrays.asList(maria, alex));
		
		list.addAll(userService.findAll());
		return ResponseEntity.ok().body(listDTO);
	}

}