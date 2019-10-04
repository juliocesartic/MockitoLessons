package com.in28minutes.data.api;

import java.util.Arrays;
import java.util.List;

//stub = example
public class TodoServiceStub implements TodoService{
	//Dynamic condition
	// Service Definition
	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
	}

}
