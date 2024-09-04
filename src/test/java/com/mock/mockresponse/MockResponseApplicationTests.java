package com.mock.mockresponse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
class MockResponseApplicationTests {



	@Test
	void contextLoads() {
		int variable = 19;
		int result = switch(variable){
			case 1 -> 5;
			case 2,3 -> {
				System.out.println("In block");
				yield 10;
			}
			default -> 20;
		};
		System.out.println(result);
	}

}

