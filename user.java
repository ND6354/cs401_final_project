package com.sun.java.util;

import java.util.Scanner;


public class user<UserCart> {
	private
		String firstname;
		String lastname;
		String PhoneNum;
		int userID;
		String address;
		String city;
		String state;
	public
		void paymentInfo(String fn, String ln, int credit, String exstate, int ccv) {
			//pre-condition - establish private variable
			//post-condition-sets payment info into a user object
		}
	
		void savedOrder(UserCart order) {
			//pre-condition - gets user log from database
			//post-condition - write/add order to log
		}
		
		// main user interface
		public static void main(String[] args) {
			//Pre-condition: Application started
			//Post-condition: picks between 3 options
			Scanner scan = new Scanner(System.in);
			String pick;
			String choice;
			System.out.println("Welcome!\n Please choose the type of user you like to access. New user or Sign in.");
			pick = scan.nextLine();
			if(pick == "New user") {
				System.out.println("Please choose a choice for new user. Guest or Register");
				choice = scan.nextLine();
				if(choice == "Guest") {
					// calls guest user method
				}
				else {
					// calls register user method
				}
			};
			if(pick == "Sign in") {// calls the sign in method
			};
		}
		}
