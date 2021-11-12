package com;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;


@SpringBootTest
class GradleDemoApplicationTests {

	private Greetings greetings;

	@Test
	void contextLoads() {
	}

	@Before
	public void setup(){
		greetings = new Greetings();
	}

	@Test
	public void greetingsShouldIncludeAMessage(){
		String message = "World";

		//checks if the first parameter's return String contains the message string.
		// using hamcrest(framework for writing matcher objects) frameworks assert and matcher methods
		assertThat(greetings.greet(message), CoreMatchers.containsString(message));
	}

	@Test
	public void greetShouldIncludeGreetingPhrase(){

		String message = "World";

		//checks if the first parameter's return String length is greater than the second parameter string length
		assertThat(greetings.greet(message).length(), is(greaterThan(message.length())));
	}

}
