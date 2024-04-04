package com.example.workshops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WorkshopsApplicationTests {

	void contextLoads() {
	}
	@Test
	void failedTest(){
		Assertions.assertEquals(1,2);
	}

}
