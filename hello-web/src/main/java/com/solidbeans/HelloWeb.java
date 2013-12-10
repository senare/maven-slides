package com.solidbeans;
import javax.inject.Named;

@Named
public class HelloWeb {

	public String getGreeting() {
		return "Hello Web !";
	}
}
