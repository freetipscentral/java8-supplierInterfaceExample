package com.freetipscentral;

import java.util.function.Supplier;

public class SupplierInterfaceEx2 {
	public static void main(String[] args) {
		
		Supplier<User> userSupplier1  = () -> new User(1,"John");
		printUser(userSupplier1);
	}
	
	public static void printUser(Supplier<User> userSupplier) {
		System.out.println(userSupplier.get());
	}
}
