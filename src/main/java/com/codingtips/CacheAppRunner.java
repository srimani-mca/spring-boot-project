package com.codingtips;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class CacheAppRunner implements ApplicationRunner {

	public CacheAppRunner() {
		System.out.println("*** CacheAppRunner::Constructor ***");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("*** AppRunner::run() method called ***");
	}

}
