package com.example.hello;

import com.example.hello.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("---------------");

		//Text Json -> Object
		//Object -> Text Json

		var objectMapper = new ObjectMapper();

		//object -> text
		var user = new User("steve", 10, "010-123-4567");

		var text = objectMapper.writeValueAsString(user);	//object안에 getter가 필요함
		System.out.println(text);

		//text -> object
		var objectUser = objectMapper.readValue(text, User.class);//default 생성자가 필요
		System.out.println(objectUser);
	}

}
