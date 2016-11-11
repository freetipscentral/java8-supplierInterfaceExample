package com.freetipscentral;

import java.util.function.Supplier;

public class SupplierInterfaceEx3 {
	public static void main(String[] args) {
		
		Supplier<User> userSupplier1  = () -> createUser();
		printUser(userSupplier1);
	}
	
	public static void printUser(Supplier<User> userSupplier) {
		System.out.println(userSupplier.get());
	}
	
	public static User createUser() {
		User user1 = new User(2,"Jenny");
		return user1;
	}
}
