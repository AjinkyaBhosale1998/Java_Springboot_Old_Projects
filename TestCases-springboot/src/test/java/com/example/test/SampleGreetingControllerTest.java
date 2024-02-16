package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleGreetingControllerTest {
	
	@Test
	public void contextLoad() {
		
		assertThat(sampleController).isNotNull();
		
	}

}
