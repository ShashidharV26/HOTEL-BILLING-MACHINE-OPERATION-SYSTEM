package com;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		System.out.println("PLACE YOUR ORDER");

		Scanner sc = new Scanner(System.in);
		Hotel hotel = new Hotel();
		hotel.addItem();

		int choice;
//		HERE WE ARE USING INFINET LOOP BECAUSE IT WILL GOSE REPEATIVE ORDERS UNTIL WE TERMINATE THE PROGRAM
		while (true) {
//			IN BUYITEM METHOD WE ARE ADDING THE TOTAL NUMBER OF ITEMS WE NEED
			hotel.buyItem();
			System.out.println("Press any number to continue Shopping");
			System.out.println("Press 1 to checkout");
			choice = sc.nextInt();
//			ONCE WE CHOSEN OPTION FOR CHECKOUT IT GENERATES THE TOTAL BILL OF CURRENT ORDER
			if (choice == 1) {
				hotel.checkoutItem();
			}
		}
	}
}
