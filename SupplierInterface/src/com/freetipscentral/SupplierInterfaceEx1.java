package com.freetipscentral;

import java.util.function.Supplier;

public class SupplierInterfaceEx1 {
	public static void main(String[] args) {
		Supplier<String> name1  = new Supplier() {
			
			@Override
			public String get() {
				return new String("Nilendu");
			}
		};
		
		System.out.println(name1.get());
		
		Supplier<String> name2  = () -> new String("John");
		System.out.println(name2.get());

		Supplier<String> name3  = () -> "Jim";
		System.out.println(name3.get());

		
	}
}
