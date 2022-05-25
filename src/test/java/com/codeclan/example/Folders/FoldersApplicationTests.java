package com.codeclan.example.Folders;

import com.codeclan.example.Folders.models.Folder;
import com.codeclan.example.Folders.models.User;
import com.codeclan.example.Folders.repositories.UserRepository;
import org.apache.catalina.Store;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FoldersApplicationTests {

	@Autowired
	UserRepository userRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void createUser(){
		User bruce = new User("Bruce");
		userRepository.save(bruce);
	}

}
