package com.streams;

import java.util.Optional;

public class Test {

	
	public static void main(String[] args) {
		
		User user = new User(10, "Nav");
		User user2 = new User(20, null);
		Optional<String> userEmailById = user.getUserEmailById(10);
		Optional<String> userEmailById2 = user.getUserEmailById(20);
		userEmailById.ifPresentOrElse(e -> System.out.println(e), ()-> System.out.println("No value"));
		userEmailById2.ifPresentOrElse(e -> System.out.println(e), ()-> System.out.println("No value"));

		Optional<Object> empty = Optional.empty();
		empty.ifPresent(n -> System.out.println(n));
		
		Optional<String> of = Optional.of("FLM");
		System.out.println(of.get());
		
		Optional<Object> ofNullable = Optional.ofNullable(null);
		ofNullable.ifPresent(n -> System.out.println(n));
		
		Optional<String> name = Optional.of("Navya");
		Optional<Integer> map = name
//				.map(n -> n.length());
				.map(String::length); //method references
		
		System.out.println(map.get());
		
		
	}
}
