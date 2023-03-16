package com;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Hotel {
	LinkedHashMap<Integer, Product> db = new LinkedHashMap<Integer, Product>();
	Scanner sc = new Scanner(System.in);
	int totalBill = 0;
	int quantity = 1;
	int productCost=1;
	
	String a="";
	void addProduct() {

		db.put(1, new Product ("Egg Rice Full   ", 50));
		db.put(2, new Product ("Egg Rice Half   ", 30));
		db.put(3, new Product ("Biryani Full    ", 100));
		db.put(4, new Product ("Biryani Half    ", 60));
		db.put(5, new Product ("Idly            ", 15));
		db.put(6, new Product ("Masala dose     ", 40));
		db.put(7, new Product ("Chitranna Full  ", 35));
		db.put(8, new Product ("Chitranna Half  ", 25));
		db.put(9, new Product ("TamatoBath Full ", 35));
		db.put(10, new Product("TamatoBath Half ", 25));
		db.put(11, new Product("Kushka Full     ", 35));
		db.put(12, new Product("Kushka Half     ", 25));
		db.put(13, new Product("Tea/Coffee      ", 10));

	}

	void buyProduct() {

		System.out.println("Enter choice");
		int choice = sc.nextInt();

		Product p = db.get(choice);

		if (p != null) {

			System.out.println("Enter Quentity:");
			int quantity = sc.nextInt();

			int productCost = quantity * p.getCost();

			totalBill = totalBill + productCost;

			a= a+quantity + " x " + p.getName()+" ==== Rs."+ productCost+"\n";


		} else {
			System.out.println("INVALID CHOICE!!!");
		}
	}
	
	void checkoutProduct() {
		System.out.println("WELCOM TO SUKSAWAD HOTEL");
		System.out.println("=====================================");
		System.out.println(a);
		System.out.println("Total Bill : Rs." + totalBill);
		System.out.println();
		System.out.println("!---THANK YOU FOR YOUR ORDER---!");
		totalBill = 0;
		quantity = 1;
		productCost=1;
		a="";
	}
}
