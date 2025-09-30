package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.config.Config;

@Component
public class SimTest {
	
	@Autowired
	private Jio jio;
	
	public void callSim() {
		jio.call();
	}
}
