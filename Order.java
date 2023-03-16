package com;

import java.util.Scanner;

public class Order {
public static void main(String[] args) {
	System.out.println("PLACE YOUR ORDER");

	Scanner sc = new Scanner(System.in);
 Hotel hotel =new Hotel();
	hotel.addProduct();

	int choice;
	while (true) {
		hotel.buyProduct();
		System.out.println("Press any number to continue Shopping");
		System.out.println("Press 1 to checkout");
		choice = sc.nextInt();
		if(choice==1) {
		hotel.checkoutProduct();
		
		}
	}

	
}
}
