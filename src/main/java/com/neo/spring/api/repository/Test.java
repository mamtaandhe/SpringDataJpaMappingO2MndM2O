package com.neo.spring.api.repository;

public class Test {

	private  static Test t = null;
	
	private Test() {}
	
	private static Test getInstance() {
		
	if(t==null) {
		t = new Test();
	}
	return t;
	}
}
