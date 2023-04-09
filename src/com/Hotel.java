package com;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Hotel {
	LinkedHashMap<Integer, Item> db = new LinkedHashMap<Integer, Item>();
	Scanner sc = new Scanner(System.in);
	int totalBill = 0;
	int quantity = 1;
	int ItemCost = 1;
	String a = "";

	void addItem() {
//        HERE WE ARE ADDIND SLNO AS KEY AND OBJECT OF ITEM AS VALUE IN THE LINKEDHASH MAP
		db.put(1, new Item("Egg Rice Full   ", 50));
		db.put(2, new Item("Egg Rice Half   ", 30));
		db.put(3, new Item("Biryani Full    ", 100));
		db.put(4, new Item("Biryani Half    ", 60));
		db.put(5, new Item("Idly            ", 15));
		db.put(6, new Item("Masala dose     ", 40));
		db.put(7, new Item("Chitranna Full  ", 35));
		db.put(8, new Item("Chitranna Half  ", 25));
		db.put(9, new Item("TamatoBath Full ", 35));
		db.put(10, new Item("TamatoBath Half ", 25));
		db.put(11, new Item("Kushka Full     ", 35));
		db.put(12, new Item("Kushka Half     ", 25));
		db.put(13, new Item("Tea/Coffee      ", 10));

	}
	
//   THIS METHOD IS USED TO DO OPERATIONS FOR BUYING ITEMS
	void buyItem() {
//		HERE WE NEED TO ENTER THE CHOICE THAT IS SLNO OF ITEM
		System.out.println("Enter choice");
		int choice = sc.nextInt();
//		BASED ON THE SLNO WE ARE GETTING THE ITEM DETAILS WHICH CONTAINS ITEM NAME AND PRICE FROM THE LINKEDHASH MAP
		Item p = db.get(choice);
//      HERE WE ARE VALIDATING IF THE ITEM SLNO IS PRESENT IN THE LIST OF ITEMS THEN IT WILL GO FURTHER STEP ELSE IT WILL PEINT INVALID CHOICE
		if (p != null) {
//			HERE WE ARE ENTERING QUENTITY OF EACH ITEM DO WE WANT
			System.out.println("Enter Quentity:");
			int quantity = sc.nextInt();
//			IT WILL GET TOTAL AMOUNT OF EACH ITEM WITH RESPECT TO ENTERED QUENTITY
			int ItemCost = quantity * p.getCost();
//			HERE IT WILL ADD THE TOTAL AMOUNT FOR EVERY ADDITION NEW ITEM AND GENERATES TOTAL BILLING AMOUNT OF RESPECTIVE ORDER
			totalBill = totalBill + ItemCost;
//			HERE VARIABLE 'a' STORES ALL ITEMS WHICH WE WERE ADDED
			a = a + quantity + "        x    " + p.getName() + "==== Rs." + ItemCost + "\n";
		} else {
			System.out.println("INVALID CHOICE!!!");
		}
	}

	
//	THIS METHOD CALLS WHEN WE ENTER FOR CHECKOUT OPTION FOR CURRENT ORDER
	void checkoutItem() {
		System.out.println("-----------------------------------------");
		System.out.println("WELCOM TO SUKSAWAD HOTEL");
		System.out.println("=========================================");
		System.out.println("Quantity      Item                 Amount");
		System.out.println("-----------------------------------------");
//		IT PRINTS THE TOTAL ITEMS WHICH WE WERE ADDED FOR CURRENT ORDER
		System.out.println(a);
		System.out.println("Total Bill : Rs." + totalBill);
		System.out.println();
//		HERE WE CREATING AN OBJECT OF DATE WHICH IS IMPORTED FROM JAVA.UTIL.DATE PACKAGE TO PRINT CURRENT ORDER DATE AND TIME
		Date date = new Date();
		System.out.println("Printed On: " + date);
		System.out.println();
		System.out.println("!---THANK YOU FOR YOUR ORDER---!");
		System.out.println("-----------------------------------------");
//		AT FINALLY AFTER GENERATING EVERY ORDER IT IS SET NEW FOR NEXT ORDER
		totalBill = 0;
		quantity = 1;
		ItemCost = 1;
		a = "";
	}
}
