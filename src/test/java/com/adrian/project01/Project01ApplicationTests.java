package com.adrian.project01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
//@ComponentScan({"com.adrian.project01"})
//@SpringBootApplication
//@SpringBootTest(classes = Project01Application.class)
@SpringApplicationConfiguration(classes = Project01Application.class)
@WebAppConfiguration
public class Project01ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
